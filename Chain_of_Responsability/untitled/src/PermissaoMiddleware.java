public class PermissaoMiddleware extends  Middleware {

    @Override
    public boolean processar(Requisicao reg) {
        if (reg.permissao != null && reg.permissao.equals("ADMIN") ) {
           return proximo.processar(reg);
        } else {
            System.out.println("PERMISSÃO: Acesso negado");
            return false;
        }

    }
}
