public class Main {
    public static void main(String[] args){

        try {
            Cliente cliente = new Cliente("clebio@gmial.com", "Clebio");
            Pedido pedido = new Pedido(cliente, "PED-001", "PAGO");

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
            System.out.println();
            pedido.atualizarStatus("EM_SEPARACAO");
            System.out.println();
            pedido.atualizarStatus("ENVIADO");
            System.out.println();
            pedido.atualizarStatus("CANCELADO");
        }
        catch(IllegalArgumentException e){
            e.getMessage();
        }

    }
}
