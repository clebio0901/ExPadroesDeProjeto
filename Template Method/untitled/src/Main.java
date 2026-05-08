public class Main {
    public static void main(String[] args) {

        ProcessadorClientes cliente =  new ProcessadorClientes("141414144-44", "fulano@gmail", "fulano", 882292241);
        cliente.processarArquivo();

        System.out.println("");

        ProcessadorProdutos produto = new ProcessadorProdutos("0001", "vestimenta", 60,  20 );
        produto.processarArquivo();

        System.out.println("");

        ProcessadorVendas venda = new ProcessadorVendas("20/04/2026", "camisa", 3,  160);
        venda.processarArquivo();


    }
}
