public class ChantillyDecorator implements Bedida{

    private final Bedida bedida;

    public ChantillyDecorator(Bedida bedida){this.bedida = bedida;}

    @Override
    public String getDescricao(){
       return bedida.getDescricao() + ", Com Chantilly";
    }

    @Override
    public double getPreco(){
        return bedida.getPreco() + 3.00;
    }
}
