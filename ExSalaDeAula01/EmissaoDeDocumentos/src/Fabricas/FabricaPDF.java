package Fabricas;

import Arquivos.Documentos;
import Arquivos.PDF;

public class FabricaPDF extends FabricaDocumento {

    @Override
    public Documentos criarDocumento(){
        return new PDF();
    }
}
