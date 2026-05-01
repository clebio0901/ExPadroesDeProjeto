public class Tarefa {

    protected  String descricao;
    protected boolean concluida;

    public Tarefa(boolean concluida, String descricao) {
        this.concluida = concluida;
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
