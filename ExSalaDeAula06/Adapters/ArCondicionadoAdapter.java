package Adapters;

import API.ArCondicionadoApi;

public class ArCondicionadoAdapter implements ControleUniversal{

    private final ArCondicionadoApi Ar;

    public ArCondicionadoAdapter(ArCondicionadoApi Ar){
        this.Ar = Ar;
    }

    @Override
    public void ligar(){Ar.ligarAr();}

    @Override
    public void  desligar(){Ar.desligarAr();}

    @Override
    public  void aumentar(){Ar.aumentarTemperatura();}

    @Override
    public  void diminui(){Ar.diminuirTemperatura();}
}
