package Adapters;

import API.TvLgApi;

public class LgAdapter implements ControleUniversal{

    private TvLgApi tv;

    public LgAdapter(TvLgApi tv){
        this.tv = tv;
    }

    @Override
    public void ligar(){tv.ligarTv();}

    @Override
    public void desligar(){tv.desligarTv();}

    @Override
    public void aumentar(){tv.aumentarSom();}

    @Override
    public void diminui(){tv.reduzirSom();}
}
