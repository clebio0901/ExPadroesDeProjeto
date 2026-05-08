public class Chamado {
    private String codigo;
    private String descricao;
    private String solicitante;
    private EstadoChamado estadoAtual;

    public Chamado(String codigo, String descricao, EstadoChamado estadoAtual, String solicitante) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estadoAtual = estadoAtual;
        this.solicitante = solicitante;
    }

    
    public void iniciarAtendimento() {
        estadoAtual.iniciarAtendimento(this);
    }

    public void aguardarCliente() {
        estadoAtual.aguardarCliente(this);
    }

    public void responderCliente() {
        estadoAtual.responderCliente(this);
    }

    public void resolver() {
        estadoAtual.resolver(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }

    public void setEstadoAtual(EstadoChamado estado){
        this.estadoAtual = estado;
    }
}
