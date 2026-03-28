package apps;

public class Alarme {

    public void tocar(){

        if(ControleVolume.getInstance().getVolume() == 80){
            System.out.println("Alarme tocando no volume " + ControleVolume.getInstance().getVolume() );
        }else{
            ControleVolume.getInstance().setVolume(80);
            System.out.println("Alarme tocando no volume " + ControleVolume.getInstance().getVolume() );
        }
    }

    public void parar(){
        System.out.println("Alarme parado! ");
    }
}
