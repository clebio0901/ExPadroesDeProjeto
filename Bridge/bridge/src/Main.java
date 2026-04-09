public class Main {
    public static void main(String[] args){
        ItemRelatorio p1 = new ItemRelatorio("Produto A", 50);
        ItemRelatorio p2 = new ItemRelatorio("Produto B", 200);
        ItemRelatorio p3 = new ItemRelatorio("Produto C", 150);

        Exportador exportadorPDF = new ExportadorPDF();
        Exportador exportadorExcel = new ExportadorExcel();

        System.out.println("--> CENÁRIO 1: Financeiro PDF Simples");
        Relatorio r1 = new RelatorioFinanceiro(exportadorPDF);
        r1.addItem(p1);
        r1.addItem(p2);
        r1.addItem(p3);
        r1.gerar(false);

        System.out.println("--> CENÁRIO 2: Financeiro Excel Detalhado");
        Relatorio r2 = new RelatorioFinanceiro(exportadorExcel);
        r2.addItem(p1);
        r2.addItem(p2);
        r2.addItem(p3);
        r2.gerar(false);

        System.out.println("--> CENÁRIO 3: Vendas PDF Detalhado");
        Relatorio r3 = new RelatorioVendas(exportadorPDF);
        r3.addItem(p1);
        r3.addItem(p2);
        r3.addItem(p3);
        r3.gerar(true);


        System.out.println("--> CENÁRIO 4: Vendas Excel Simples");
        Relatorio r4 = new RelatorioVendas(exportadorExcel);
        r4.addItem(p1);
        r4.addItem(p2);
        r4.addItem(p3);
        r4.gerar(false);
    }

}
