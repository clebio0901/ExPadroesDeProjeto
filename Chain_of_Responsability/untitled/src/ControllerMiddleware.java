public class ControllerMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao reg){
        System.out.println("CONTROLLER: Requisição processada com sucesso");
        return true;
    }
}
