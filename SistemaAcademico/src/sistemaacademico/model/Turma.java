
package sistemaacademico.model;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Curso curso;
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;
    
    //CONSTRUTOR ===============
    public Turma(String codigo, Curso curso, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.curso = curso;
        this.disciplina = disciplina;
        this.professor = professor;        
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    //METODOS
    
    public void mudarProfessor(Professor novoProfessor) {
    	this.professor = novoProfessor;    	
    }
    
    @Override
    public String toString() {
        return getCodigo();
    }
      
    
}