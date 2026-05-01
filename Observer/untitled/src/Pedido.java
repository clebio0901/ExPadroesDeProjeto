import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoSubject {

    protected String id;
    protected String status;
    protected Cliente cliente;
    private List<PedidoObserver> observadores = new ArrayList<>();


    public Pedido(){}

    public Pedido(Cliente cliente, String id, String status) {
        this.cliente = cliente;
        this.id = id;
        this.status = status;
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
        return status;
    }
    

    public void adiconarObserver(PedidoObserver observer){
        observadores.add(observer);
    }
    @Override
    public void removerObserver(PedidoObserver observer){
        observadores.remove(observer);
    }
    @Override
    public void notificarObserver(){
        for(PedidoObserver obs : observadores){
            obs.atualizar(this);
        }
    }
    public void atualizarStatus(String novoStatus){
        if(novoStatus == null || novoStatus.trim().isEmpty()){
            throw new IllegalArgumentException("Status não pode ser nulo ou vazio");
        }

        this.status = novoStatus;
        notificarObserver();
    }



}
