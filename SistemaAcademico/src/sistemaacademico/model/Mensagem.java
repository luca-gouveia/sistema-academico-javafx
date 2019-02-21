package sistemaacademico.model;

public class Mensagem {
    private String texto;
    private String remetente;
    private boolean lido;

    public Mensagem(String texto, String remetente) {
        this.texto = texto;
        this.remetente = remetente;
        this.lido = false;
    }   

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }


    public String getRemetente() {
	return remetente;
    }


    public void setRemetente(String remetente) {
	this.remetente = remetente;
    }
	
    @Override
    public String toString() {
        return getRemetente();
    }
    

}
