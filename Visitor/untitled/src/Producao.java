public class Producao implements Setor{

    private String nivelRisco; // Ex: Baixo, Medio, Alto
    private int quantidadeEquipamentosPesados;

    public Producao(String nivelRisco, int quantidadeEquipamentosPesados) {
        this.nivelRisco = nivelRisco;
        this.quantidadeEquipamentosPesados = quantidadeEquipamentosPesados;
    }

    public String getNivelRisco() { return nivelRisco; }
    public int getQuantidadeEquipamentosPesados() { return quantidadeEquipamentosPesados; }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}
