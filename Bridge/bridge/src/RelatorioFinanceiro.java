import java.util.List;

public class RelatorioFinanceiro extends Relatorio {

    protected String Titulo = "Relatório Financeiro";


    public RelatorioFinanceiro(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar() {
        double total = calcularTotal();
        exportador.exportar(Titulo, this.itens, total);
    }
    @Override
    public void gerar(boolean detalhado){
        List<ItemRelatorio> itensFiltrados = filtrarItensDetalhados((detalhado));
        double totalFiltrado = 0.0;
        for(ItemRelatorio item : itensFiltrados){
            totalFiltrado += item.getValor();
        }

        exportador.exportar(Titulo, itensFiltrados, totalFiltrado);

    }

}
