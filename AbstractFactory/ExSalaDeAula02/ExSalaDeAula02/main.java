import Fabrica.FornecedorInternacional;
import Fabrica.FornecedorNacionalFactory;

public class main {

    public static void main(String[] args){
        FornecedorInternacional fornecedorInternacional = new FornecedorInternacional();
        CheckoutService checkoutService= new CheckoutService(fornecedorInternacional);

        FornecedorNacionalFactory fornecedorNacionalFactory = new FornecedorNacionalFactory();
        CheckoutService checkoutService01 = new CheckoutService(fornecedorNacionalFactory);


      checkoutService01.finalizaCompra("PED-10", 100.0, 10.0);
      System.out.println();
      checkoutService.finalizaCompra("PED-11", 100.0, 10.0);



    }
}
