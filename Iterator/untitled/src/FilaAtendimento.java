import java.util.ArrayList;
import java.util.List;

public class FilaAtendimento {

    private List<SenhaAtendimento>  senhas = new ArrayList<>();

    public void adiciona(SenhaAtendimento senha){
        senhas.add(senha);
    }

    public FilaAtendimentoIterator criaIterator(){
        return new FilaAtendimentoIterator(senhas);
    }

}
