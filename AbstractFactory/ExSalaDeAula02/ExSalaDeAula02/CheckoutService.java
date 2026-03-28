import Fabrica.FabricaFactory;
import Requisitos.Entrega;
import Requisitos.NotaFiscal;
import Requisitos.Pagamento;

public class CheckoutService {

    private final Pagamento pagamento;
    private final Entrega entrega;
    private final NotaFiscal notaFiscal;


    public CheckoutService(FabricaFactory  factory){
        this.pagamento = factory.criarPagamento();
        this.entrega = factory.criarEntrega();
        this.notaFiscal = factory.criarNotaFiscal();
    }

    public void finalizaCompra(String pedidoId, double valorProdutos, double pesoKg){
        System.out.println("== CHECKOUT pedido " + pedidoId + " ==");
        System.out.println("Frete calculado: " + entrega.calcularFrete(pesoKg, pedidoId));
        System.out.println("Total: " +( valorProdutos + entrega.calcularFrete(pesoKg, pedidoId)));
        System.out.println(pagamento.pagar(valorProdutos));
        System.out.println("NF gerada: " +  notaFiscal.emitir(pedidoId, valorProdutos));
    }
}
