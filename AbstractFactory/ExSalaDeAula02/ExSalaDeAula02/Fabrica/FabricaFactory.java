package Fabrica;

import Requisitos.Entrega;
import Requisitos.NotaFiscal;
import Requisitos.Pagamento;

public interface FabricaFactory {
    Pagamento criarPagamento();
    NotaFiscal criarNotaFiscal();
    Entrega criarEntrega();
}
