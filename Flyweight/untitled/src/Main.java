public class Main {
    public static void main(String[] args){

        //BLOCOS DE PEDRA
        Bloco bloco1 = BlocoFactory.getBloco("Pedra", "pedra.png", true );
        Bloco bloco2 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        Bloco bloco3= BlocoFactory.getBloco("Pedra", "pedra.png", true );

        //BLOCOS DE GRAMA
        Bloco bloco4 = BlocoFactory.getBloco("Grama", "grama.png", true );
        Bloco bloco5 = BlocoFactory.getBloco("Grama", "grama.png", true );

        //BLOCOS DE MADEIRA
        Bloco bloco6 = BlocoFactory.getBloco("Madeira", "madeira.png", true );

        //COLOCANDO AS POSIÇÕES
        bloco1.exibir(10, 64, 20);
        bloco2.exibir(11, 64, 20);
        bloco3.exibir(12, 64, 20);
        bloco4.exibir(15, 64, 22);
        bloco5.exibir(16, 64, 22);
        bloco6.exibir(30, 65, 10);

        //COMPARANDO


        if(bloco1.equals(bloco2)){
            System.out.println("pedra1 e pedra2 são o mesmo objeto? " + true);
        }else{
            System.out.println("pedra1 e pedra2 são o mesmo objeto? " + false);
        }


    }

}
