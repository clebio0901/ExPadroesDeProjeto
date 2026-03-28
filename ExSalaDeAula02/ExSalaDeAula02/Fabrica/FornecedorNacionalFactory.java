package Fabrica;

import Requisitos.Entrega;
import Requisitos.NotaFiscal;
import Requisitos.Pagamento;
import apllication.EntregaNacional;
import apllication.NotaFiscalNacional;
import apllication.PagamentoNacional;

public class FornecedorNacionalFactory implements FabricaFactory{
    @Override
    public Pagamento criarPagamento(){
        return new PagamentoNacional();
    }
    @Override
    public NotaFiscal criarNotaFiscal(){
        return new NotaFiscalNacional();
    }
    @Override
    public Entrega criarEntrega(){
        return new EntregaNacional();
    }
}
