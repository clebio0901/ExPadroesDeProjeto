import Fabricas.FabricaPDF;
import Fabricas.FabricaPLANILHA;
import Fabricas.FabricaWORD;

public class Program {
    public static void main(String[] args){

        System.out.println("====Teste: PDF =====");
        FabricaPDF pdf = new FabricaPDF();
        pdf.criarDocumento().gerar();
        System.out.println();

        System.out.println("====Teste: WORD =====");
        FabricaWORD word = new FabricaWORD();
        word.criarDocumento().gerar();
        System.out.println();

        System.out.println("====Teste: PLANILHA =====");
        FabricaPLANILHA planilha = new FabricaPLANILHA();
        planilha.criarDocumento().gerar();


    }
}
