import java.util.ArrayList;
import java.util.List;

public abstract class  Relatorio {

    protected Exportador exportador;
    protected List<ItemRelatorio> itens;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemRelatorio iten){
       this.itens.add(iten);
    }

    protected double calcularTotal(){
        double total = 0.0;
        for(ItemRelatorio iten: itens){
            total += iten.getValor();
        }
        return total;
    }

    public abstract void gerar();

    public abstract void gerar(boolean detalhado);

    protected List<ItemRelatorio> filtrarItensDetalhados(boolean detalhado){
        List<ItemRelatorio> novaLista = new ArrayList<>();
        for(ItemRelatorio item: itens) {
            if (detalhado == true) {
                novaLista.add(item);
            } else {
                if (item.getValor() >= 100) {
                    novaLista.add(item);
                }
            }
        }
        return novaLista;
    }


}
