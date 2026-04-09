import java.util.List;

public class ExportadorPDF implements  Exportador{

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double valor) {
        System.out.println("=== EXPORTANDO PDF ===\n");
        System.out.println("Titulo: " + titulo);
        System.out.println("Itens: ");
        for(ItemRelatorio iten: itens){
            System.out.println("_ " + iten.getDiscricao() + "| R$ " + iten.getValor());
        }
        System.out.println("Totla: R$" + valor);
        System.out.println("======================");
    }
}
