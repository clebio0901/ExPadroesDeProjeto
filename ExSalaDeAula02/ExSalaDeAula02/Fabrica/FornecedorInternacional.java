package Fabrica;

import Requisitos.Entrega;
import Requisitos.NotaFiscal;
import Requisitos.Pagamento;
import apllication.*;

public class FornecedorInternacional implements FabricaFactory{

    @Override
    public Pagamento criarPagamento(){
        return new PagamentoInternacional();
    }
    @Override
    public NotaFiscal criarNotaFiscal(){
        return new NotaFiscalInternacional();
    }
    @Override
    public Entrega criarEntrega(){
        return new EntregaInternacional();
    }
}
