public class CaldaChocolateDecorator implements Bedida {

    private final Bedida bedida;

    public CaldaChocolateDecorator(Bedida bedida){this.bedida = bedida;}

    @Override
    public String getDescricao(){
       return bedida.getDescricao() + ", Com Calda de Chocolate";
    }

    @Override
    public double getPreco(){
        return bedida.getPreco() + 2.50;
    }
}
