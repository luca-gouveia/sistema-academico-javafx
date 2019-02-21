
package sistemaacademico.model;

import java.util.ArrayList;


public class Coordenador{
    private String senha = "0000";         
    private String matricula = "180000"; 
    private String nome = "Coordenador";
    private int indexUsuarioTela;

    
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Pessoa> pessoas = new ArrayList<>(); // PARA A PARTE DAS MENSAGENS
    
    private ArrayList<Mensagem> inbox = new ArrayList<>();
    //CONSTRUTOR
    public Coordenador() {
		
    }


    //GETTERS AND SETTERS
        
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIndexUsuarioTela() {
        return indexUsuarioTela;
    }

    public void setIndexUsuarioTela(int indexUsuarioTela) {
        this.indexUsuarioTela = indexUsuarioTela;
    }
    

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    
    //SENHA
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   //MATRICULA
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //ALUNOS
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        alunos.add(aluno);
    }
    
    //PROFESSORES
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professor) {
        professores.add(professor);
    }
    
    //CURSOS
    public ArrayList<Curso> getCursos(){
        return cursos;
    }
    public void setCurso(Curso curso){
        cursos.add(curso);
    }   
    
    //DISCIPLINAS
    public ArrayList<Disciplina> getDisciplinas(){
        return disciplinas;
    }
    public void setDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    } 
    
    //TURMAS
    public ArrayList<Turma> getTurmas(){
        return turmas;
    }
    public void setTurma(Turma turma){
        turmas.add(turma);
    } 
     
    //INBOX
    public ArrayList<Mensagem> getInbox() {
        return inbox;
    }

    public void setInbox(Mensagem mensagem) {
    	inbox.add(mensagem);
    }
      
    //METODOS
    public int registrarAluno(String nome, String cpf, String matricula, Curso curso){
        matricula += "01";
    	if(getAlunos().size() > 0){
            for(int i = 0; i < getAlunos().size(); i++) {
                if(matricula.equals(alunos.get(i).getMatricula())){
                    System.out.println("Matricula já cadastrada"); 
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    return 1;
                }
            }
        }
        Aluno aluno = new Aluno(nome, cpf, matricula, curso);
        setAlunos(aluno);
        setPessoas(aluno);
        
        System.out.println("CADASTRADO O NOVO ALUNO");
        return 0;
    }
    
    public int registrarProfessor(String nome, String cpf, String area, String matricula, Curso curso){
        matricula += "02";
    	if(getProfessores().size() > 0){
            for(int i = 0; i < professores.size(); i++) {
                if(matricula.equals(professores.get(i).getMatricula())){
                System.out.println("Matricula já cadastrada");
                //EXCEPTION
                //EXCEPTION
                //EXCEPTION
                //EXCEPTION
                //EXCEPTION
                return 1;
                }
            }
        }
        
        Professor professor = new Professor(nome, cpf, matricula, curso, area);
        setProfessores(professor);
        setPessoas(professor);
        System.out.println("CADASTRADO O NOVO PROFESSOR");
        return 0;
    }
    
    public int criarCurso(String nome){
        if(getCursos().size() > 0){
            for(int i = 0; i < cursos.size(); i++) {
                if(nome.equals(cursos.get(i).getNome()) ){
                System.out.println("CURSO já cadastrado");
                //EXCEPTION
                //EXCEPTION
                //EXCEPTION
                //EXCEPTION
                //EXCEPTION
                return 1;
                }
            }
        }
        
        Curso curso = new Curso(nome);
        setCurso(curso);
        System.out.println("CADASTRADO O NOVO CURSO");
        return 0;
        
    }
    
    public int criarTurma(String codigo, Curso curso, Disciplina disciplina, Professor professor){
        if(getTurmas().size() > 0){
            for(int i = 0; i < turmas.size(); i++) {
                if(disciplina.equals(turmas.get(i).getDisciplina() ) ){
                    System.out.println("TURMA já cadastrado");
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    return 1;
                }
            }
        }
        
        codigo = codigo+"-"+disciplina.getNome();//DEFININDO UM CODIGO PERSONALIZADO PARA A TURMA (EX:'123-Algoritmo')
        
        Turma turma = new Turma(codigo, curso, disciplina, professor);
        setTurma(turma);

        System.out.println("CADASTRADA A NOVA TURMA!");
        return 0;

    }
    
    public int criarDisciplina(String nome, Curso curso){
        if(getDisciplinas().size() > 0){
            for(int i = 0; i < disciplinas.size(); i++) {
                if(nome.equals(disciplinas.get(i).getNome() ) ){
                    System.out.println("DISCIPLINA já cadastrado");
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    //EXCEPTION
                    return 1;
                }
            }
        }
        
        Disciplina disciplina = new Disciplina(nome,curso);
        setDisciplina(disciplina);

        System.out.println("CADASTRADA A NOVA DISCIPLINA!");
        return 0;
    }
    
     //-- PARA OBJETOS QUE HERDAM DE PESSOA (ALUNO E PROFESSOR)
    public void enviarMensagem(Pessoa destinatario, String texto) {
    	Mensagem mensagem = new Mensagem(texto,this.getNome());
    	destinatario.setInbox(mensagem);
    }   
        
}