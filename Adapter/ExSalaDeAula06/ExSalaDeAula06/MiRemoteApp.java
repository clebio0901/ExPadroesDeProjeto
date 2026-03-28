import Adapters.ControleUniversal;

public class MiRemoteApp {

    private final ControleUniversal dispositivo;

    public MiRemoteApp(ControleUniversal dispositivo){
        this.dispositivo = dispositivo;
    }

    public void iniciar(){
        dispositivo.ligar();
        dispositivo.aumentar();
        System.out.println("[Mi Remote] Pronto! Iniciando..." );
    }

    public void encerrar(){
        dispositivo.diminui();
        dispositivo.desligar();
        System.out.println("[Mi Remote] Encerrado.");
    }
}
