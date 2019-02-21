package sistemaacademico.model;

import java.util.ArrayList;

public class Curso {
    private String nome;
    
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;

    
    //CONSTRUTOR ===============
    public Curso(String nome) {
        this.nome = nome;
        
    }
    public Curso(){ 
        
    }
    
    // GETTERS E SETTERS ===============
    //NOME
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //DISCIPLINA
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina nomeDisciplinas) {
        disciplinas.add(nomeDisciplinas);
    }
    
    //TURMAS
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurma(Turma a) {
        turmas.add(a);
    }
    
    //PROFESSORES
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professor) {
        professores.add(professor);
    }
    
    //ALUNOS
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return getNome();
    }
   
}