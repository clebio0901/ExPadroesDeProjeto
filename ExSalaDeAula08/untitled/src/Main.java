import fachada.ViagemFacade;
import model.Cliente;

public class Main {
    public static void main(String[] args){

        Cliente cliente01 = new Cliente("João" , "joao@gmial.com");
        ViagemFacade viagemFacade01 = new ViagemFacade();
        viagemFacade01.reservasViagem(cliente01,"Recife");

        //System.out.println(viagemFacade01);

        Cliente cliente02 = new Cliente("Maria" , "maria@gmial.com");
        ViagemFacade viagemFacade02 = new ViagemFacade();
        viagemFacade02.reservasViagem(cliente02,"São Paulo");

       // System.out.println(viagemFacade02);



    }
}
