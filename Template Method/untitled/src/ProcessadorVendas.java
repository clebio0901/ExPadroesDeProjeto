public class ProcessadorVendas extends ProcessadorArquivo{

    private String dataVenda;
    private String produtoVendido;
    private double quantidade;
    private int valorTotal;

    public ProcessadorVendas(String dataVenda, String produtoVendido, double quantidade, int valorTotal) {
        this.dataVenda = dataVenda;
        this.produtoVendido = produtoVendido;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }


    @Override
    protected void validarArquivos(){
        System.out.println("Validando dados da venda...");
    }

    @Override
    protected void lerDados(){
        System.out.println("Lendo dados da venda...");
    }

    @Override
    protected void processarDados(){
        System.out.println("Processando dados da venda...");
    }
}
