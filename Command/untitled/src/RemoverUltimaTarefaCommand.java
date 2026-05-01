public class RemoverUltimaTarefaCommand implements Command{

    protected Tarefa tarefa;
    protected GerenciadorTarefas gerenciador;

    public RemoverUltimaTarefaCommand(GerenciadorTarefas gerenciador){
        this.gerenciador = gerenciador;
    }

    @Override
    public void execute(){
        tarefa = gerenciador.removerUltimaTarefa();
        if (tarefa != null) {
            System.out.println("Última tarefa removida: " + tarefa.getDescricao());
        }
    }

    @Override
    public void undo(){
        if (tarefa != null) {
            System.out.println("Restaurando tarefa removida: " + tarefa.getDescricao());
            gerenciador.adicionarTarefa(tarefa);
        }
    }
}
