package apllication;

import Requisitos.Pagamento;

public class PagamentoInternacional implements Pagamento {
    @Override
    public boolean pagar(double valor){
        System.out.println("[NACIONAL] Pagamento aprovado");
        return true;
    }
}
