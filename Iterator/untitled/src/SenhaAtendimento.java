public class SenhaAtendimento {

    private String indentificacaoDeSenha;
    private String nome;
    private String tipoDeAtendimento;


    public SenhaAtendimento(String indentificacaoDeSenha, String nome, String tipoDeAtendimento) {
        this.indentificacaoDeSenha = indentificacaoDeSenha;
        this.nome = nome;
        this.tipoDeAtendimento = tipoDeAtendimento;
    }

    public String getIndentificacaoDeSenha() {
        return indentificacaoDeSenha;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDeAtendimento() {
        return tipoDeAtendimento;
    }

    @Override
    public String toString() {
        return "Chamando senha: " + indentificacaoDeSenha + " - " + nome + " - " + tipoDeAtendimento;
    }
}
