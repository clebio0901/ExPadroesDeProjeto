import java.util.List;

public class Main {
    public static void main(String[] args){
        //QUESTÕES
        Questao q1 = new Questao("Q1", "Questão 01", 1);
        Questao q2 = new Questao("Q2", "Questão 02", 1);
        Questao q3 = new Questao("Q3", "Questão 03", 1);



        Prova Av = new Prova(
                "Prova SQL - Template",
                "TEMPLATE",
                "2026-03-10",
                "BASE",
                List.of(q1, q2, q3));

        Av.printResumo();

        System.out.println("TURMA A - AV1");
        Prova prova1 = Av.provaCopia();
        prova1.setTurma("2° INFO A");
        prova1.setData("2026-03-20");
        prova1.setVersao("V1");

        prova1.substituirQuestao("Q2", new Questao("Q2", "Escreva um comando INSERT", 3));

        System.out.println();
        System.out.println("Prova 1 — Turma A (V1)");
        prova1.printResumo();


        System.out.println("TURMA B - AV1");
        Prova prova2 = Av.provaCopia();
        prova2.setTurma("2° INFO B");
        prova2.setData("2026-03-20");
        prova2.setVersao("V1");

        prova2.substituirPontos("Q2", 5);

        System.out.println();
        System.out.println("Prova 1 — Turma A (V1)");
        prova2.printResumo();

        System.out.println("\n---- TESTE DE CÓPIA PROFUNDA ----");
        System.out.println("Alterando o enunciado da Q1 na Prova 1...");

        for(Questao q : prova1.getQuestoes()){
            if(q.getId().equals("Q1")){
                q.setEnunciado("O que significa a sigla SQL e para que serve?");
            }
        }

        System.out.println("\nImprimindo Template (Não deve estar alterado):");
        Av.printResumo();

        System.out.println("\nImprimindo Prova 1 (Deve estar com a Q1 alterada):");
        prova1.printResumo();


    }


}
