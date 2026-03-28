package model;

public class Reserva {

    protected String destino;
    protected String codigo = "RES 123";

    public Reserva() {
    }

    public Reserva(String destino) {
        this.destino = destino;

    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }
}
