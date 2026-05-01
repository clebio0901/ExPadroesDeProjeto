import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoSubject {

    protected String id;
    protected String Status;
    protected Cliente cliente;
    private List<PedidoObserver> observadores = new ArrayList<>();


    public Pedido(){}

    public Pedido(Cliente cliente, String id, String status) {
        this.cliente = cliente;
        this.id = id;
        Status = status;
    }

    public List<PedidoObserver> getObservadores() {
        return observadores;
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getStatus() {
        return Status;
    }

    public void adiconarObserver(PedidoObserver observer){
        observadores.add(observer);
    }
    public void removerObserver(PedidoObserver observer){
        observadores.remove(observer);
    }
    public void notificarObserver(){
        for(PedidoObserver obs : observadores){
            obs.atualizar(this);
        }
    }
    public void atualizarStatus(String novoStatus){
        System.out.println("Status atualizado: " + novoStatus);
        this.Status = novoStatus;
        notificarObserver();
    }



}
