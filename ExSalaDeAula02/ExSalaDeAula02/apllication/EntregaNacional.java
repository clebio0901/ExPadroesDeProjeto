package apllication;

import Requisitos.Entrega;

public class EntregaNacional implements Entrega {
    @Override
    public double calcularFrete(double pesoKg, String cepDestino){
        return 15.0 + (pesoKg * 2.0);
    }
}
