public class Armazem implements Setor{

    private String responsavel;
    private int quantidadeProdutosInflamaveis;
    private boolean organizado;

    public Armazem(String responsavel, int quantidadeProdutosInflamaveis, boolean organizado) {
        this.responsavel = responsavel;
        this.quantidadeProdutosInflamaveis = quantidadeProdutosInflamaveis;
        this.organizado = organizado;
    }

    public String getResponsavel() { return responsavel; }
    public int getQuantidadeProdutosInflamaveis() { return quantidadeProdutosInflamaveis; }
    public boolean isOrganizado() { return organizado; }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}
