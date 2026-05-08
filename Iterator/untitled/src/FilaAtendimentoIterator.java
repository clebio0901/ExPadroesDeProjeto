import java.util.ArrayList;
import java.util.List;

public class FilaAtendimentoIterator implements IteratorSenha{

    private List<SenhaAtendimento> senhas;
    private int posicao;

    public FilaAtendimentoIterator(List<SenhaAtendimento> senha){
        senhas = senha;
    }


    @Override
    public boolean proximaSenha(){
        return posicao < senhas.size();
    }

    @Override
    public SenhaAtendimento proximaSenhaAtendimento(){
        SenhaAtendimento senha = senhas.get(posicao);
        posicao++;
        return senha;
    }



}
