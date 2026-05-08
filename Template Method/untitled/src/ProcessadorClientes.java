public class ProcessadorClientes extends ProcessadorArquivo {

    private String nome;
    private String cpf;
    private String emial;
    private int telefone;

    public ProcessadorClientes(String cpf, String emial, String nome, int telefone) {
        this.cpf = cpf;
        this.emial = emial;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    protected void validarArquivos(){
        System.out.println("Validando dados do cliente...");
    }

    @Override
    protected void lerDados(){
        System.out.println("Lendo dados do cliente...");
    }

    @Override
    protected void processarDados(){
        System.out.println("Processando dados do cliente...");
    }
}
