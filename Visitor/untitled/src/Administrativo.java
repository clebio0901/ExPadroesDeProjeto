public class Administrativo implements Setor{

    private int quantidadeColaboradores;
    private int quantidadeLixeiras;

    public Administrativo(int quantidadeColaboradores, int quantidadeLixeiras) {
        this.quantidadeColaboradores = quantidadeColaboradores;
        this.quantidadeLixeiras = quantidadeLixeiras;
    }

    public int getQuantidadeColaboradores() { return quantidadeColaboradores; }
    public int getQuantidadeLixeiras() { return quantidadeLixeiras; }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}
