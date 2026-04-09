public class ItemRelatorio {

    protected String discricao;
    protected double valor;

    public ItemRelatorio(){}

    public ItemRelatorio(String discricao, double valor) {
        this.discricao = discricao;
        this.valor = valor;
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
