public class CentralAtendimentoClinica implements MediadorClinica{

    private Recepcao recepcao;
    private Medico medico;
    private Enfermagem enfermagem;
    private Laboratorio laboratorio;
    private Paciente paciente;


    public void setRecepcao(Recepcao recepcao) { this.recepcao = recepcao; }
    public void setMedico(Medico medico) { this.medico = medico; }
    public void setEnfermagem(Enfermagem enfermagem) { this.enfermagem = enfermagem; }
    public void setLaboratorio(Laboratorio laboratorio) { this.laboratorio = laboratorio; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    @Override
    public void notificar(String evento, Participante remetente) {
        System.out.println("\n[MEDIADOR PROCESSANDO]: Evento '" + evento + "' recebido de " + remetente.getClass().getSimpleName());


        if (remetente instanceof Paciente && evento.equals("CHEGUEI")) {
            recepcao.receberMensagem("O paciente " + paciente.getNome() + " chegou à clínica.");

        }
        else if (remetente instanceof Recepcao && evento.equals("INICIAR_ATENDIMENTO")) {
            enfermagem.receberMensagem("Por favor, faça a triagem do paciente " + paciente.getNome());

        }
        else if (remetente instanceof Enfermagem && evento.equals("TRIAGEM_CONCLUIDA")) {
            medico.receberMensagem("O paciente " + paciente.getNome() + " está pronto para consulta.");

        }
        else if (remetente instanceof Medico && evento.equals("SOLICITAR_EXAME")) {
            laboratorio.receberMensagem("Coletar sangue do paciente " + paciente.getNome());

        }
        else if (remetente instanceof Laboratorio && evento.equals("EXAME_PRONTO")) {
            medico.receberMensagem("Os resultados do exame do paciente " + paciente.getNome() + " estão no sistema.");
            recepcao.receberMensagem("Preparar documentação de alta para o paciente " + paciente.getNome());

        }
        else if (remetente instanceof Recepcao && evento.equals("FINALIZAR_ATENDIMENTO")) {
            paciente.receberMensagem("Seu atendimento foi finalizado. Melhoras!");
        }
    }
}
