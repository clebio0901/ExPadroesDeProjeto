public class CanelaDecorator implements Bedida{
    private final Bedida bedida;

    public CanelaDecorator(Bedida bedida){this.bedida = bedida;}

    @Override
    public String getDescricao(){
        return bedida.getDescricao() + ", Com Canela";
    }

    @Override
    public double getPreco(){
        return bedida.getPreco() + 1.50;
    }
}
