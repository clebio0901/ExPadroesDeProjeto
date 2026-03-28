package apllication;

import Requisitos.Entrega;

public class EntregaInternacional implements Entrega {
    @Override
    public double calcularFrete(double pesoKg, String cepDestino){
        return 40 + (pesoKg * 5.0);
    }
}
