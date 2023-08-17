public class Imagem extends Post{
    private int tamanho;
    private int altura;
    private int largura;
    private String formato;
    

    public Imagem(int tamanho, int altura, int largura, String formato) {
        this.tamanho = tamanho;
        this.altura = altura;
        this.largura = largura;
        this.formato = formato;
    }


    public int getTamanho() {
        return tamanho;
    }


    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    public int getAltura() {
        return altura;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }


    public int getLargura() {
        return largura;
    }


    public void setLargura(int largura) {
        this.largura = largura;
    }


    public String getFormato() {
        return formato;
    }


    public void setFormato(String formato) {
        this.formato = formato;
    }


        
}
