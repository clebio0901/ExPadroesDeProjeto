public class Documento {

    private String titulo;
    private String conteudo;
    private String autor;
    private String versao;

    public Documento(String autor, String conteudo, String titulo, String versao) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.titulo = titulo;
        this.versao = versao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String toString() {
        return "Titulo: " + titulo
                + "\nConteudo: " + conteudo
                + "\nAutor: " + autor
                + "\nVersao: " + versao;
    }

    public MementoDocumento salvar(){
        System.out.println("Ultima versão salva...");
        return new MementoDocumento(this.autor, this.conteudo, this.titulo, this.versao);
    }

    public void restaurar(MementoDocumento save) {
        this.titulo = save.getTitulo();
        this.conteudo = save.getConteudo();
        this.autor = save.getAutor();
        this.versao = save.getVersao();

        System.out.println("Documento restaurado.");

    }

}
