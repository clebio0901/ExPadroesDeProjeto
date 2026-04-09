import java.util.List;

public class ExportadorExcel implements Exportador {

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double valor) {
        System.out.println("=== EXPORTANDO EXCEL ===\n");
        System.out.println("[" + titulo + "]");
        System.out.println("descricao,valor: ");
        for(ItemRelatorio iten: itens){
            System.out.println("_ " + iten.getDiscricao() + ";" + iten.getValor());
        }
        System.out.println("Totla: R$" + valor);
        System.out.println("======================");
    }
}
