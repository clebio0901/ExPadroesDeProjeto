public class LeiteExtraDecorator implements Bedida{

    private final Bedida bedida;

    public LeiteExtraDecorator(Bedida bedida){this.bedida = bedida;}

    @Override
    public String getDescricao() {
        return bedida.getDescricao() + ", Com Leite Extra";
    }

    @Override
    public double getPreco() {
        return bedida.getPreco() + 2.00;
    }
}
