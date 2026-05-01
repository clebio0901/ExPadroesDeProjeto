public class AdicionarTarefaCommand implements Command {

    protected Tarefa tarefa;
    protected GerenciadorTarefas gerenciador;

    public AdicionarTarefaCommand(Tarefa tarefa, GerenciadorTarefas gerenciador){
        this.tarefa = tarefa;
        this.gerenciador = gerenciador;
    }

    @Override
    public void execute(){
        System.out.println("Tarefa adicionada: " + tarefa.getDescricao());
        gerenciador.adicionarTarefa(tarefa);
    }
    @Override
    public void undo(){
        System.out.println("Desfazendo adição da tarefa: " + tarefa.getDescricao());
        gerenciador.removerTarefa(tarefa);
    }


}
