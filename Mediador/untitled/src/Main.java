public class Main {
    public static void main(String[] args) {

        CentralAtendimentoClinica central = new CentralAtendimentoClinica();


        Paciente paciente = new Paciente(central, "Carlos Silva");
        Recepcao recepcao = new Recepcao(central);
        Enfermagem enfermagem = new Enfermagem(central);
        Medico medico = new Medico(central);
        Laboratorio laboratorio = new Laboratorio(central);

        central.setPaciente(paciente);
        central.setRecepcao(recepcao);
        central.setEnfermagem(enfermagem);
        central.setMedico(medico);
        central.setLaboratorio(laboratorio);

        System.out.println("=== INÍCIO DO FLUXO DE ATENDIMENTO ===");


        paciente.enviarMensagem("CHEGUEI");


        recepcao.enviarMensagem("INICIAR_ATENDIMENTO");


        enfermagem.enviarMensagem("TRIAGEM_CONCLUIDA");


        medico.enviarMensagem("SOLICITAR_EXAME");


        laboratorio.enviarMensagem("EXAME_PRONTO");


        recepcao.enviarMensagem("FINALIZAR_ATENDIMENTO");


    }
}
