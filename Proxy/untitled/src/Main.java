public class Main {
    public static  void main(String[] args){
        try{
            Conteudo conteudo = new FilmePremiumProxy();

            Usuario usuario1 = new Usuario("Carlos","PREMIUM");
            conteudo.assistir(usuario1);
            System.out.println("---------------------");

            Usuario usuario2 = new Usuario("Ana","BASICO");
            conteudo.assistir(usuario2);
            System.out.println("--------------------");

            Usuario usuario3 = new Usuario("Maria","PREMIUM");
            conteudo.assistir(usuario3);
            System.out.println("--------------------");

            Usuario usuario4 = new Usuario("Pedro","BASICO");
            conteudo.assistir(usuario4);
            System.out.println("--------------------");


            conteudo.assistir(null);



        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
