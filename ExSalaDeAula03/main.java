public class main {
    public static void main(String[] args) {

        Pedido p1 = new PedidoBuilder().tipoHamburguer().tipoPao("BRIOCHE")
                .pagarComPix().addItem("X-Bacon").tamanho("M")
                .entregaDelivery("com endereço").observacao("sem cebola").build();

        p1.printResumo();

        Pedido p2 = new PedidoBuilder().tipoPizza().tipoMassa("FINA")
                .pagarComCartao().addItem("Pizza Calabresa").bordarRecheada().tamanho("G")
                .entregaRetirada().cupom("10OFF").build();

        p2.printResumo();

        Pedido p3 = new PedidoBuilder().tipoHamburguer().tipoPao("BRIOCHE")
                .pagarComDinheiro().addItem("X-Salada").tamanho("P")
                .entregaDelivery("com endereço").observacao("sem carne")
                .comTrocoPara(100.00).build();

        p3.printResumo();







    }
}