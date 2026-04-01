public class Main {
    public static void main(String[] args){

        Produto prdt1 = new Produto("Mouse", 80);
        Produto prdt2 = new Produto("Teclado", 150);
        Produto prdt3 = new Produto("Monitor", 900);
        Produto prdt4 = new Produto("Mousepad", 40);

        Kit kitPeriferico = new Kit("Kit Periferico");
        kitPeriferico.adicionar(prdt1);
        kitPeriferico.adicionar(prdt2);
        kitPeriferico.adicionar(prdt4);

        Kit kitSetup = new Kit("Kit Setup");
        kitSetup.adicionar(prdt3);
        kitSetup.adicionar(kitPeriferico);


        kitSetup.exibir("");

    }
}
