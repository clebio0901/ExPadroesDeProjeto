public class Cliente {

    protected String nome;
    protected String email;

    public Cliente(){}

    public Cliente(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }


}
