import java.util.ArrayList;
import java.util.List;

public class Prova {

    private String titulo;
    private String turma;
    private String data;
    private String versao;
    private List<Questao> questoes;


    public Prova(String titulo, String turma, String data, String versao, List<Questao> questoes){
        this.titulo = titulo;
        this.turma = turma;
        this.data = data;
        this.versao = versao;
        this.questoes = questoes;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public Prova provaCopia(){
            List<Questao> questoesClomadas = new ArrayList<>();
            for(Questao q : this.questoes){
                questoesClomadas.add(q.copiarQuestao());
            }
        return new Prova(
                this.titulo,
                this.turma,
                this.data,
                this.versao,
                questoesClomadas
                );
    }

    public int totalPontos(){

        int total = 0;
        for(Questao pontos : questoes) {
            total += pontos.getPontos();
        }
        return total;
    }

    public void substituirQuestao(String id, Questao nova){

        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).getId().equals(id)) {
                questoes.set(i, nova);
                break;
            }
        }
    }

    public void substituirPontos(String id, int pontos){
        for( Questao questao : questoes) {
            if(questao.getId().equals(id)) {
                questao.setPontos(pontos);
                break;
            }
        }
    }


    public void printResumo(){
        System.out.println("Titulo da prova: " + titulo );
        System.out.println("Turma da prova: " + turma );
        System.out.println("Data da prova: " + data );
        System.out.println("Versão da prova: " + versao );
        System.out.println("Questão da prova: " + questoes );
        System.out.println("Total de pontos da prova = " + totalPontos() );

        for(Questao pontos : questoes) {
            System.out.println(" Id da questão " + pontos.getId() + ", ponto  = " + pontos.getPontos());
        }

    }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setTurma(String turma) { this.turma = turma; }
    public void setData(String data) { this.data = data; }
    public void setVersao(String versao) { this.versao = versao; }
    public void setQuestoes(Questao questao) { this.questoes.add(questao); }



}
