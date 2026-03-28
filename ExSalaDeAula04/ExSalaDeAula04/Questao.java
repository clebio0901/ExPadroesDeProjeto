public class Questao {

    private  String id;
    private String enunciado;
    protected int pontos;


    public Questao(String id, String enuciado, int pontos){
        this.enunciado = enuciado;
        this.pontos = pontos;
        this.id = id;
    }

    public Questao copiarQuestao(){
        return new Questao(
                this.id,
                this.enunciado,
                this.pontos
        );

    }

    public String toString(){
        return "Enunciado: " +
                enunciado
                + ", ID: "
                + id
                + ", Pontos: "
                + String.format("%d ",pontos )
                + "|";
    }

    public int getPontos(){
        return this.pontos;
    }

    public void setPontos(int id){this.pontos = id;}

    public String getId(){return this.id;}

    public void setEnuciado(String enuciado) { this.enunciado = enuciado; }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
}
