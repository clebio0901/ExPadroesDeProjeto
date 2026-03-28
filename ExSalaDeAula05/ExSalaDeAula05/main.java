import apps.Alarme;
import apps.BotaoFisicoVolume;
import apps.ControleVolume;
import apps.PlayerMusica;

public class main {
    public static void main(String[] arsg){

       try{

           ControleVolume a = ControleVolume.getInstance();
           ControleVolume b = ControleVolume.getInstance();

           System.out.println("Mesma instância? " + (a == b));

           BotaoFisicoVolume botao = new BotaoFisicoVolume();
           PlayerMusica player = new PlayerMusica();
           Alarme alarme = new Alarme();

           System.out.println("\n===Teste Botção Volume===");

           player.mostrarVolume();
           botao.pressionarMais();
           botao.pressionarMais();
           player.mostrarVolume();

           System.out.println("\n===Teste Alarme===");

           alarme.tocar();
           player.mostrarVolume();

           System.out.println("\n===Mute e Limites===");

           ControleVolume.getInstance().mutar();
           player.mostrarVolume();
           ControleVolume.getInstance().setVolume(95);
           botao.pressionarMais();
           botao.pressionarMais();
           player.mostrarVolume();


       }catch (Exception e){
           e.getMessage();
       }

    }
}
