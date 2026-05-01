public interface PedidoSubject {

    void adiconarObserver(PedidoObserver observer);
    void removerObserver(PedidoObserver observer);
    void notificarObserver();



}
