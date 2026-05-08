public class Main {
    public static void main(String[] args){

        System.out.println("\n=== Criar um chamado com: código, descrição e solicitante ===");
        Chamado chamado1 = new Chamado("1010", "Cliente informa estar sem internet", new EstadoAberto(), "Clebio");

        System.out.println("\n=== Tentar resolver o chamado ainda aberto ===");
        chamado1.resolver();

        System.out.println("\n=== Iniciar atendimento ===");
        chamado1.iniciarAtendimento(); 

        System.out.println("\n=== Colocar o chamado como aguardando cliente ===");
        chamado1.aguardarCliente();

        System.out.println("\n=== Tentar resolver enquanto aguarda cliente ===");
        chamado1.resolver();

        System.out.println("\n=== Registrar resposta do cliente ===");
        chamado1.responderCliente();

        System.out.println("\n=== Resolver o chamado ===");
        chamado1.resolver();

        System.out.println("\n=== Tentar cancelar depois de resolvido ===");
        chamado1.cancelar();

        System.out.println("\n=== Criar um segundo chamado ===");
        Chamado chamado2 = new Chamado("1020", "Monitor não liga", new EstadoAberto(), "Fulano");

        System.out.println("\n=== Cancelar o segundo chamado ainda aberto ===");
        chamado2.cancelar();

        System.out.println("\n=== Tentar iniciar atendimento no chamado cancelado ===");
        chamado2.iniciarAtendimento();
    }
}
