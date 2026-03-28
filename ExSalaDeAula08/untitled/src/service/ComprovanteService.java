package service;

import model.Reserva;

public class ComprovanteService {

    public Reserva gerarComprovante(String destino){
       Reserva reserva =  new Reserva(destino);
       System.out.println("Comprovante gerado!");
       return reserva;
    }
}
