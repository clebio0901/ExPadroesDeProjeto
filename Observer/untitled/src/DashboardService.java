public class DashboardService implements PedidoObserver {

    @Override
    public void atualizar(Pedido pedido){
        System.out.println("DASHBOARD: Atualizado painel do pedido " + pedido.getId() + " com o status " + pedido.getStatus()) ;
    }

}
