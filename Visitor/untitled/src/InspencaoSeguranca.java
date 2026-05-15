public class InspencaoSeguranca implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {
        System.out.println("SEGURANÇA (Armazém): Verificando extintores. Produtos inflamáveis encontrados: "
                + armazem.getQuantidadeProdutosInflamaveis());
        if(armazem.getQuantidadeProdutosInflamaveis() > 10) {
            System.out.println("  -> ALERTA: Risco alto de incêndio. Reforçar segurança!");
        }
    }

    @Override
    public void visitar(Administrativo administrativo) {
        System.out.println("SEGURANÇA (Administrativo): Verificando saídas de emergência para "
                + administrativo.getQuantidadeColaboradores() + " colaboradores.");
    }

    @Override
    public void visitar(Frota frota) {
        System.out.println("SEGURANÇA (Frota): Checando itens obrigatórios de segurança nos "
                + frota.getQuantidadeVeiculos() + " veículos.");
        if(!frota.isManutencaoEmDia()){
            System.out.println("  -> ALERTA: Veículos com manutenção atrasada representam risco de acidentes!");
        }
    }

    @Override
    public void visitar(Producao producao) {
        System.out.println("SEGURANÇA (Produção): Risco do setor é " + producao.getNivelRisco().toUpperCase() + ".");
        System.out.println("  -> Checando EPIs para operação de " + producao.getQuantidadeEquipamentosPesados() + " equipamentos pesados.");
    }
}
