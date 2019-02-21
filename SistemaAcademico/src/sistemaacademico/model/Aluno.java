
package sistemaacademico.model;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();
  
    //CONSTRUTOR
    public Aluno(String nome, String cpf, String matricula, Curso curso) {
        super(nome, cpf, matricula, curso);
    }
      
    //GETTERS AND SETTERS
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina disciplina) {
	this.disciplinas.add(disciplina);
    }

    public ArrayList<Turma> getTurmas() {
	return turmas;
    }

    public void setTurmas(Turma turma) {
        turmas.add(turma);
    }
	

    @Override
    public String toString() {
        return getNome();
    }
    
    public void addTurma(Turma t){
        turmas.add(t);
    }


}
