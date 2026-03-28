public class Main {
    public static void main(String[] args){

        //Cenário 1
        //Um café com leite extra
        Bedida cafe = new Cafe();
        Bedida LeiteExtraDecorator = new LeiteExtraDecorator(cafe);
        System.out.println(LeiteExtraDecorator.getDescricao());
        System.out.println("Preço: R$ " + LeiteExtraDecorator.getPreco());
        System.out.println("-------------------");

        System.out.println();

        //Cenário 2
        //Um capuccino com chantilly e canela
        Bedida capuccino = new Capuccino();
        Bedida chantilly = new ChantillyDecorator(capuccino);
        Bedida canela = new CanelaDecorator(chantilly);
        System.out.println( canela.getDescricao());
        System.out.println("Preço: R$ " + canela.getPreco());
        System.out.println("-------------------");

        //Cenário 3
        //Um chocolate quente com leite extra, chantilly e calda de chocolate
        Bedida chocolate = new ChocolateQuente();
        Bedida leiteExtra = new LeiteExtraDecorator(chocolate);
        Bedida chantilly1 = new ChantillyDecorator(leiteExtra);
        Bedida caldaChocolate = new CaldaChocolateDecorator(chantilly1);
        System.out.println( caldaChocolate.getDescricao());
        System.out.println("Preço: R$ " + caldaChocolate.getPreco());
        System.out.println("-------------------");

    }
}
