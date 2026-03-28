package Fabricas;

import Arquivos.Documentos;
import Arquivos.PDF;
import Arquivos.WORD;

public class FabricaWORD extends FabricaDocumento{
    @Override
    public Documentos criarDocumento(){
        return new WORD();
    }
}
