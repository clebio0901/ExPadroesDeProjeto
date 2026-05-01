public class LogMiddleware extends Middleware{

    @Override
    public boolean processar(Requisicao reg){
        System.out.println("LOG: Requisição processada");
        return proximo.processar(reg);
    }


}
