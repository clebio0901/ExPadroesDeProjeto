import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
    protected String tipo;
    protected String tamanho;
    protected String pagamento;
    protected List<String> itens = new ArrayList<>();

    protected String tipoPao;
    protected String tipoMassa;
    protected boolean bordaRecheada = false;
    protected String entrega;
    protected String enderecoEntrega;
    protected String cupom;
    protected String observacao;
    protected Double trocoPara;


    public PedidoBuilder tipoHamburguer() {
        this.tipo = "HAMBURGUER";
        return this;
    }

    public PedidoBuilder tipoPizza() {
        this.tipo = "PIZZA";
        return this;
    }

    public PedidoBuilder comTrocoPara(double valor) {
        this.trocoPara = valor;
        return this;
    }

    public PedidoBuilder entregaDelivery(String endereco) {
        this.entrega = "DELIVERY";
        this.enderecoEntrega = endereco;
        return this;
    }

    public PedidoBuilder entregaRetirada() {
        this.entrega = "RETIRADA";
        this.enderecoEntrega = null;
        return this;
    }

    public PedidoBuilder addItem(String item) {
        this.itens.add(item);
        return this;
    }

    public PedidoBuilder tamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PedidoBuilder tipoPao(String PAO) {
        this.tipoPao = PAO;
        return this;
    }
    public PedidoBuilder tipoMassa(String massa) {
        this.tipoMassa = massa;
        return this;
    }

    public PedidoBuilder pagarComPix() { this.pagamento = "PIX"; return this; }
    public PedidoBuilder pagarComCartao() { this.pagamento = "CARTAO"; return this; }
    public PedidoBuilder pagarComDinheiro() { this.pagamento = "DINHEIRO"; return this; }

    public PedidoBuilder observacao(String obs) { this.observacao = obs; return this; }


    public PedidoBuilder bordarRecheada() {
        this.bordaRecheada = true;
        return this;
    }

    public PedidoBuilder cupom(String cupom) { this.cupom = cupom; return this; }




    public Pedido build() {

        if (tipo == null) throw new IllegalStateException("O tipo (HAMBURGUER ou PIZZA) é obrigatório.");
        if (itens.isEmpty()) throw new IllegalStateException("Pedido precisa de pelo menos 1 item.");
        if (pagamento == null) throw new IllegalStateException("Forma de pagamento é obrigatória.");


        if (tipo.equals("HAMBURGUER")) {
            if (tipoPao == null || tipoPao.isBlank()) throw new IllegalStateException("A escolha do Pão é obrigatória para Hambúrguer.");
        }
        else if (tipo.equals("PIZZA")) {
            if (tipoMassa == null || tipoMassa.isBlank()) throw new IllegalStateException("A escolha da massa é obrigatória para Pizza.");
        }


        if ("DELIVERY".equals(entrega) && (enderecoEntrega == null || enderecoEntrega.isBlank())) {
            throw new IllegalStateException("Endereço é obrigatório para Delivery.");
        }


        if (!"DINHEIRO".equals(pagamento) && trocoPara != null) {
            throw new IllegalStateException("Não podemos definir troco para pagamentos que não sejam DINHEIRO.");
        }


        return new Pedido(this);
    }
}