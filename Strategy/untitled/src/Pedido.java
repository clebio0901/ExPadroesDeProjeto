public class Pedido {

    private Extrategia extrategia;
    private double valor;

    public Pedido(Extrategia extrategia, double valor) {
        this.extrategia = extrategia;
        this.valor = valor;
    }

    public void alterarExtrategia(Extrategia extrategia){
        this.extrategia = extrategia;
    }

    public double calcularTotal(){
        return extrategia.calcularTotal(valor);
    }
}
