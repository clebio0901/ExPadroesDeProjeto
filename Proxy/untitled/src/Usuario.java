public class Usuario {

    protected  String nome;
    protected String plano;

    public Usuario(){}

    public Usuario(String nome, String plano){
        this.nome = nome;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}

