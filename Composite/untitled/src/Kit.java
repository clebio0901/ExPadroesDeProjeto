import java.util.ArrayList;
import java.util.List;

public class Kit implements ItemLoja{

    protected  String nome;
    protected List<ItemLoja> itemLojaList = new ArrayList<>();

    public Kit( String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemLoja item){
        itemLojaList.add(item);
    }

    public void remover(ItemLoja item){
        itemLojaList.remove(item);
    }

    @Override
    public String getNome(){return nome;}

    @Override
    public double getPreco(){
        double soma = 0;
        for( ItemLoja item: itemLojaList){
           soma += item.getPreco();
        }
        return soma;
    }

    @Override
    public void exibir(String prefixo){

        System.out.println( prefixo + "Kit: " + getNome() + "| Total: R$" + getPreco());
        for(ItemLoja item1: itemLojaList){
            item1.exibir(prefixo + "  ");
        }

    }

}
