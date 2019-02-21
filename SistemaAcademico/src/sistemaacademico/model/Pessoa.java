package sistemaacademico.model;

import java.util.ArrayList;

/**
 *
 * @author luca
 */
public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String matricula;
    protected String senha;
    protected Curso curso;
    protected ArrayList<Mensagem> inbox = new ArrayList<>();

    //CONSTRUTOR
    public Pessoa(String nome, String cpf, String matricula, Curso curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.curso = curso;
        
        this.senha = "0000";
    }
        
    //METODOS ESPECIAIS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public ArrayList<Mensagem> getInbox() {
        return inbox;
    }

    public void setInbox(Mensagem mensagem) {
    	inbox.add(mensagem);
    }

    //OUTROS METODOS
    public void mudarSenha(String novaSenha) {
    	this.senha = novaSenha;    	
    }
    
    //-- PARA OBJETOS QUE HERDAM DE PESSOA (ALUNO E PROFESSOR)
    public void enviarMensagem(Pessoa destinatario, String texto) {
    	Mensagem mensagem = new Mensagem(texto,this.getNome());
    	destinatario.setInbox(mensagem);
    }   
    //-- EXCLUSIVO PARA O COORDENADOR (RECEBIMENTO DE MENSAGEM POR PARTE DELE)
    public void enviarMensagem(Coordenador destinatario, String texto) {
    	Mensagem mensagem = new Mensagem(texto,this.getNome());
    	destinatario.setInbox(mensagem);
    } 
        

    
}
