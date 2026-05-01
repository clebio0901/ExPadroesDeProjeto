public class Main {
    public static void main(String[] args){


        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        PainelControle painel = new PainelControle();

        Tarefa tarefa1 = new Tarefa(false, "Estudar Command");
        Tarefa tarefa2 = new Tarefa(false, "Implementar exercício");
        Tarefa tarefa3 = new Tarefa(false, "Revisar Observer");
        Tarefa tarefa4 = new Tarefa(false, "Estudar Chain of Responsibility");

        System.out.println("==== ETAPA 1 (Execução Imediata) ====");
        painel.executarComando(new AdicionarTarefaCommand(tarefa1, gerenciador));
        painel.executarComando(new AdicionarTarefaCommand(tarefa2, gerenciador));
        painel.executarComando(new ConcluirTarefaCommand(tarefa1));

        System.out.println("\n==== ETAPA 2 (Desfazer) ====");
        painel.desfazerUltimoComando();
        System.out.println("\n==== ETAPA 3 (Fila) ====");

        painel.adicionarNaFila(new AdicionarTarefaCommand(tarefa3, gerenciador));
        painel.adicionarNaFila(new AdicionarTarefaCommand(tarefa4, gerenciador));
        painel.adicionarNaFila(new ConcluirTarefaCommand(tarefa2));

        painel.processarFila();

        System.out.println("\n==== ETAPA 4 (Exibição Final) ====");
        gerenciador.exibirTarefas();

    }
}
