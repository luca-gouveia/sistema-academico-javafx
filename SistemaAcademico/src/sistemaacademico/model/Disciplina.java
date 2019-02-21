
package sistemaacademico.model;

public class Disciplina {
    private String nome;
    private Curso curso;
   
    
    //CONSTRUTOR ===============
    public Disciplina(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    // GETTERS E SETTERS ===============
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return getNome();
    }
    
}
