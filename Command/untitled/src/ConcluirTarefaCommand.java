import java.util.List;

public class ConcluirTarefaCommand implements Command{

    protected Tarefa tarefa;

    public ConcluirTarefaCommand(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void execute(){
        System.out.println("Tarefa concluída: " + tarefa.getDescricao());
        tarefa.setConcluida(true);
    }
    @Override
    public void undo(){
        System.out.println("Tarefa voltou para pendente: " + tarefa.getDescricao());
        tarefa.setConcluida(false);
    }
}
