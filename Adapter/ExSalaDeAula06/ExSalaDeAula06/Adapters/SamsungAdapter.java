package Adapters;

import API.TvSamsungApi;

public class SamsungAdapter implements ControleUniversal{

     private final TvSamsungApi tv;

     public SamsungAdapter(TvSamsungApi tv){
         this.tv = tv;
     }

     @Override
    public void ligar() {tv.powerOn();}

    @Override
    public void desligar(){ tv.powerOff();}

    @Override
    public  void aumentar(){tv.volUp();}

    @Override
    public  void diminui(){tv.volDown();}
}
