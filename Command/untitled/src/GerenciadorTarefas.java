import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    protected List<Tarefa> tarefaList = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa){
        tarefaList.add(tarefa);
    }

    public Tarefa removerUltimaTarefa() {
        if (!tarefaList.isEmpty()) {
            return tarefaList.remove(tarefaList.size() - 1);
        }
        return null;
    }

    public void removerTarefa(Tarefa tarefa){
        tarefaList.remove(tarefa);
    }

    public void concluirTarefa(Tarefa tarefa){
        for(Tarefa tarefa1 : tarefaList){
            if(tarefa1.equals(tarefa)){
                tarefa.setConcluida(true);
            }
            else{
                System.out.println("Tarefa não encontrada");
            }
        }
    }

    public void exibirTarefas(){
        System.out.println("\n--- Lista de Tarefas ---");
        for(Tarefa t : tarefaList){
            System.out.println(t.getDescricao());
        }
        System.out.println("------------------------\n");
    }

}
