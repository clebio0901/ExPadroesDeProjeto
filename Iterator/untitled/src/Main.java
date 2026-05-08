import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FilaAtendimento fila = new FilaAtendimento();

        fila.adiciona(new SenhaAtendimento("A001", "Maria", "Prioritário"));
        fila.adiciona(new SenhaAtendimento("A002", "João", "Normal"));
        fila.adiciona(new SenhaAtendimento("A003", "Carlos", "Financeiro"));
        fila.adiciona(new SenhaAtendimento("A004", "Ana", "Agendamento"));
        fila.adiciona(new SenhaAtendimento("A005", "Pedro", "Suporte"));

        FilaAtendimentoIterator interador = fila.criaIterator();

        while(interador.proximaSenha()){
            SenhaAtendimento senha = interador.proximaSenhaAtendimento();
            System.out.println(senha.toString());
        }


    }
}
