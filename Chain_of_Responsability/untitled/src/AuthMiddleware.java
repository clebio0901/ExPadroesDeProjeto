public class AuthMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao reg) {
        if (reg.token == null || !reg.token.equals("valido")){
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;
        }
        return proximo.processar(reg);
    }
}
