package apps;

public class ControleVolume {
    private int volume = 50;

    private static final ControleVolume INSTANCE = new ControleVolume();

    private ControleVolume(){ }

    public static ControleVolume getInstance(){
        return  INSTANCE;
    }

    public  int getVolume(){
        return volume;
    }

    public void aumentar(int valor){
        int valor1 = this.volume + valor;
        if(valor1 >= 100){
            this.volume = 100;
        } else {
            this.volume += valor;
        }
    }
    public  void diminuir(int valor) throws IllegalArgumentException {
        int valor1 = this.volume - valor;
        if(valor1 < 0){
            this.volume = 0;
        } else {
            this.volume -= valor;
        }
    }
    public void mutar(){
        this.volume = 0;
    }
    public void setVolume( int novoVolume){
        this.volume = novoVolume;
    }

}
