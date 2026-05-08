public class ProcessadorProdutos extends ProcessadorArquivo {

    private String codigo;
    private String descricao;
    private int preco;
    private double quantidade;

    public ProcessadorProdutos(String codigo, String descricao, int preco, double quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    protected void validarArquivos(){
        System.out.println("Validando dados do produto...");
    }

    @Override
    protected void lerDados(){
        System.out.println("Lendo dados do produto...");
    }

    @Override
    protected void processarDados(){
        System.out.println("Processando dados do produto...");
    }


}
