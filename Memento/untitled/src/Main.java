public class Main {
    public static void main(String[] args) {

        HistoricoDocumento historico = new HistoricoDocumento();

        System.out.println("--- 1. Criar e exibir documento inicial ---");
        Documento documento = new Documento("Clebio", "Era uma vez...", "O Conto", "1.0");
        System.out.println(documento.toString());

        System.out.println("\n--- 2. Salvar a primeira versão ---");
        historico.adicionarMemento(documento.salvar());

        System.out.println("\n--- 3. Alterar o conteúdo e salvar nova versão ---");
        documento.setConteudo("Era uma vez um reino distante...");
        documento.setVersao("1.1");
        System.out.println(documento.toString());
        historico.adicionarMemento(documento.salvar());

        System.out.println("\n--- 4. Fazer uma nova alteração (SEM SALVAR) e exibir ---");
        documento.setTitulo("As Fúrias Do Cariri");
        documento.setAutor("Fulano");
        documento.setVersao("1.2");
        System.out.println(documento.toString());

        System.out.println("\n--- 5. Restaurar a versão anterior e exibir ---");
        MementoDocumento memento1 = historico.ultimoMemento();
        if(memento1 != null){
            documento.restaurar(memento1);
        }
        System.out.println(documento.toString());

        System.out.println("\n--- 6. Restaurar novamente para versão mais antiga e exibir ---");
        MementoDocumento memento2 = historico.ultimoMemento();
        if(memento2 != null){
            documento.restaurar(memento2);
        }
        System.out.println(documento.toString());


    }
}
