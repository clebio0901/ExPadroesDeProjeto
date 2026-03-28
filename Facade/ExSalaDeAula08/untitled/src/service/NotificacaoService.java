package service;

import model.Cliente;
import model.Reserva;

public class NotificacaoService {

    public void enviarConfirmacao(Cliente cliente, Reserva reserva){
        System.out.println("Confirmação enviada para " + cliente.getEmail() + " Com o código " + reserva.getCodigo());
    }
}
