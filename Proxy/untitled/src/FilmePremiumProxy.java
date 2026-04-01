public class FilmePremiumProxy implements Conteudo {

    private FilmePremium filmePremium;

    public FilmePremiumProxy(){
        this.filmePremium = new FilmePremium();
    }

    @Override
    public void assistir(Usuario usuario) throws IllegalArgumentException {
        if(usuario == null) {
            throw new IllegalArgumentException("erro: ");
        }
        if (usuario.getPlano().equalsIgnoreCase("PREMIUM")) {
            System.out.println("Acesso liberado para " + usuario.getNome());
            filmePremium.assistir(usuario);
        } else {
            System.out.println("Acesso negado para " + usuario.getNome() + ", Plano: (" + usuario.getPlano() + ")");
        }

    }

}
