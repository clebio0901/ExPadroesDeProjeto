public class PagamentoPix implements Extrategia{
    @Override
    public double calcularTotal(double valor){
        return valor -= valor*0.1;
    }
}
