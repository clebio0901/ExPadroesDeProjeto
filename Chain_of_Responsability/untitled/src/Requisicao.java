public class Requisicao {

    protected String usuario;
    protected String token;
    protected  String permissao;
    protected boolean dadosValidos;

    public Requisicao(String usuario, String token, String permissao, boolean dadosValidos) {
        this.dadosValidos = dadosValidos;
        this.permissao = permissao;
        this.token = token;
        this.usuario = usuario;
    }


}
