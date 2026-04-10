public class TipoBloco implements Bloco{

    protected String nome;
    protected  String textura;
    protected  boolean solido;

    public TipoBloco(String nome, String textura, boolean solido) {
        this.nome = nome;
        this.textura = textura;
        this.solido = solido;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public void exibir(int x, int y, int z){
        System.out.printf("Bloco %s | textura: %s | sólido: %s | posição: (%d, %d, %d)\n", nome, textura, solido, x, y, z);
    }

}
