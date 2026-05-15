public class AvaliacaoLimpeza  implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {
        System.out.println("LIMPEZA (Armazém): O armazém está " + (armazem.isOrganizado() ? "organizado." : "desorganizado e precisa de varrição."));
    }

    @Override
    public void visitar(Administrativo administrativo) {
        System.out.println("LIMPEZA (Administrativo): Checando poeira nas mesas e esvaziando as "
                + administrativo.getQuantidadeLixeiras() + " lixeiras.");
    }

    @Override
    public void visitar(Frota frota) {
        System.out.println("LIMPEZA (Frota): Agendando lavagem externa e aspiração para "
                + frota.getQuantidadeVeiculos() + " veículos.");
    }

    @Override
    public void visitar(Producao producao) {
        System.out.println("LIMPEZA (Produção): Recolhendo resíduos e sobras industriais em volta dos equipamentos.");
    }
}
