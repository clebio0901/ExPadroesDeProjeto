import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Setor> setoresDaEmpresa = new ArrayList<>();
        setoresDaEmpresa.add(new Armazem("Carlos", 15, false));
        setoresDaEmpresa.add(new Administrativo(40, 10));
        setoresDaEmpresa.add(new Frota(8, false));
        setoresDaEmpresa.add(new Producao("Alto", 5));


        VisitanteSetor inspecaoSeguranca = new InspencaoSeguranca();
        VisitanteSetor avaliacaoLimpeza = new AvaliacaoLimpeza();


        System.out.println("====== INICIANDO INSPEÇÃO DE SEGURANÇA ======");
        for (Setor setor : setoresDaEmpresa) {
            setor.aceitar(inspecaoSeguranca);
        }

        System.out.println("\n====== INICIANDO AVALIAÇÃO DE LIMPEZA ======");

        for (Setor setor : setoresDaEmpresa) {
            setor.aceitar(avaliacaoLimpeza);
        }

    }
}
