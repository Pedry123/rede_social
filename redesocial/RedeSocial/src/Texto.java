public class Texto extends Post {
    private String texto;
    private int numCaracteres;


    public Texto(String texto, int numCaracteres) {
        this.texto = texto;
        this.numCaracteres = numCaracteres;
    }


    public String getTexto() {
        return texto;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }


    public int getNumCaracteres() {
        return numCaracteres;
    }


    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }


}
