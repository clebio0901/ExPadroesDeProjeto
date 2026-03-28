package Fabricas;

import Arquivos.Documentos;
import Arquivos.PDF;
import Arquivos.PLANILHA;

public class FabricaPLANILHA extends FabricaDocumento{
    @Override
    public Documentos criarDocumento(){
        return new PLANILHA();
    }
}
