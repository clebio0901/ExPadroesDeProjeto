public class Main {
    public static void main(String[] args){

        Middleware auth  = new AuthMiddleware();
        Middleware permissao  = new PermissaoMiddleware();
        Middleware validacao = new ValidacaoMiddleware();
        Middleware log = new LogMiddleware();
        Middleware controller = new ControllerMiddleware();

        // Montando a cadeia: Auth → Permissão → Validação → Log → Controller
        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);

        System.out.println("--- Cenário 1 (Válido) ---");
        Requisicao req1 = new Requisicao("admin", "valido", "ADMIN", true);
        auth.processar(req1);

        System.out.println("\n--- Cenário 2 (Token Inválido) ---");
        Requisicao req2 = new Requisicao("admin", "invalido", "ADMIN", true);
        auth.processar(req2);

        System.out.println("\n--- Cenário 3 (Sem Permissão) ---");
        Requisicao req3 = new Requisicao("user", "valido", "USER", true);
        auth.processar(req3);

        System.out.println("\n--- Cenário 4 (Dados Inválidos) ---");
        Requisicao req4 = new Requisicao("admin", "valido", "ADMIN", false);
        auth.processar(req4);

    }
}
