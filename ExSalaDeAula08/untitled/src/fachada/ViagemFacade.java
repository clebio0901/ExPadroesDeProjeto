package fachada;

import model.Cliente;
import model.Reserva;
import service.*;

public class ViagemFacade {

    public Reserva reservasViagem(Cliente cliente, String destino){

        VooService vooService = new VooService();
        HotelService hotelService = new HotelService();
        TransportService transportService = new TransportService();
        ComprovanteService comprovanteService = new ComprovanteService();
        NotificacaoService notificacaoService = new NotificacaoService();
        Reserva reserva = new Reserva();

        vooService.reservaVoo(destino);
        hotelService.reservaHotel(destino);
        transportService.reservaTrasporte(destino);
        comprovanteService.gerarComprovante(destino);
        notificacaoService.enviarConfirmacao(cliente, reserva);

        return reserva;
    }
}
