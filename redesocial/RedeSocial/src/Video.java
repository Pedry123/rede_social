public class Video extends Imagem {
    private int duracao;
    private int resolucao;

    public Video(int tamanho, int altura, int largura, String formato, int duracao, int resolucao) {
        super(tamanho, altura, largura, formato);
        this.duracao = duracao;
        this.resolucao = resolucao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getResolucao() {
        return resolucao;
    }

    public void setResolucao(int resolucao) {
        this.resolucao = resolucao;
    }


}
