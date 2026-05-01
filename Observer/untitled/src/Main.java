public class Main {
    public static void main(String[] args){

        Cliente cliente = new Cliente("clebio@gmial.com", "Clebio");
        Pedido pedido = new Pedido(cliente, "PED-001 ", "PAGO");

        PedidoObserver email = new EmialService();
        PedidoObserver faturamento = new FaturamentoService();
        PedidoObserver estoque = new EstoqueService();
        PedidoObserver log = new LogService();
        PedidoObserver dash = new DashboardService();

        pedido.adiconarObserver(email);
        pedido.adiconarObserver(log);
        pedido.adiconarObserver(dash);
        pedido.adiconarObserver(estoque);
        pedido.adiconarObserver(faturamento);



        pedido.atualizarStatus("PAGO");
        pedido.atualizarStatus("EM_SEPARACAO");
        pedido.atualizarStatus("ENVIADO");
        pedido.atualizarStatus("CANCELADO");

    }
}
