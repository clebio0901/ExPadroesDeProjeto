import API.ArCondicionadoApi;
import API.TvLgApi;
import API.TvSamsungApi;
import Adapters.ArCondicionadoAdapter;
import Adapters.ControleUniversal;
import Adapters.LgAdapter;
import Adapters.SamsungAdapter;

public class Main {
    public static void main(String[] args){

        //Controlando uma Samsung
        ControleUniversal samsung = new SamsungAdapter((new TvSamsungApi()));
        MiRemoteApp app1 = new MiRemoteApp(samsung);
        app1.iniciar();
        app1.encerrar();

        System.out.println();
        //Controlando uma Lg
        ControleUniversal LG = new LgAdapter((new TvLgApi()));
        MiRemoteApp app2 = new MiRemoteApp(LG);
        app2.iniciar();
        app2.encerrar();

        System.out.println();
        //Controlando uma Ar
        ControleUniversal Ar = new ArCondicionadoAdapter((new ArCondicionadoApi()));
        MiRemoteApp app3 = new MiRemoteApp(Ar);
        app3.iniciar();
        app3.encerrar();



    }

}
