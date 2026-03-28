import java.util.List;

public class Pedido {

    private final String tipo;
    private final String tamanho;
    private final String pagamento;
    private final List<String> itens;

    private final String tipoPao;
    private final String tipoMassa;
    private final boolean bordaRecheada;
    private final String entrega;
    private final String enderecoEntrega;
    private final String cupom;
    private final String observacao;
    private final Double trocoPara;


    protected Pedido(PedidoBuilder builder) {
        this.tipo = builder.tipo;
        this.tamanho = builder.tamanho;
        this.pagamento = builder.pagamento;
        this.itens = builder.itens;
        this.tipoPao = builder.tipoPao;
        this.tipoMassa = builder.tipoMassa;
        this.bordaRecheada = builder.bordaRecheada;
        this.entrega = builder.entrega;
        this.enderecoEntrega = builder.enderecoEntrega;
        this.cupom = builder.cupom;
        this.observacao = builder.observacao;
        this.trocoPara = builder.trocoPara;
    }

    public void printResumo() {
        System.out.println("=== RESUMO DO PEDIDO ===");

        System.out.println("Tipo: " + tipo);
        if (tipoPao != null){
            System.out.println("Pão = " + tipoPao);
        }else{ System.out.println("Massa = " + tipoMassa);}
        System.out.println("Tamanho = " + tamanho);
        System.out.println("Itens = \""  + itens + "\"");
        if (bordaRecheada == true){System.out.println("Borda recheada = " + bordaRecheada);}
        System.out.println("Pagamento = " + pagamento);
        System.out.println("Entrega = " + ((enderecoEntrega != null) ? entrega  + "," + enderecoEntrega :   entrega ));
        if(observacao != null){System.out.println("Observação = " + observacao);}
        if(cupom != null){System.out.println("Cupom = " + cupom);}
        if(trocoPara != null){System.out.println("Troco Para = " + trocoPara);}

        System.out.println("========================\n");
    }
}