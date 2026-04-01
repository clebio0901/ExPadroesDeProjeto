public class Produto implements ItemLoja{

    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome(){ return "Produto: " + nome;}

    @Override
    public double getPreco(){ return preco;}

    @Override
    public void exibir(String  prefixo){
        System.out.println(prefixo + " Produto: " + nome + "| Preço: " + preco);
    }

}
