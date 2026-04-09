public class PagamentoBoleto implements Extrategia {

    @Override
    public double calcularTotal(double valor){
        valor -= valor*0.05;
        return valor + 2;
    }
}
