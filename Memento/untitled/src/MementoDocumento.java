public class MementoDocumento {

    private String titulo;
    private String conteudo;
    private String autor;
    private String versao;

    public MementoDocumento(String autor, String conteudo, String titulo, String versao) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.titulo = titulo;
        this.versao = versao;
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getVersao() {
        return versao;
    }

}
