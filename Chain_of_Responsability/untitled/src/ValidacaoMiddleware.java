public class ValidacaoMiddleware extends Middleware{

    @Override
    public boolean processar(Requisicao reg){
        if(!reg.dadosValidos){
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false;
        }else{
           return proximo.processar(reg);

        }
    }
}
