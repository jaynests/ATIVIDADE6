public class Main {
    public static void main(String[] args) {
        Publicacao pub1 = new Publicacao("01/05/2023", "Primeira publicação", "");
        Publicacao pub2 = new Publicacao("02/05/2023", "Segunda publicação", "");
        Publicacao pub3 = new Publicacao("03/05/2023", "Terceira publicação", "");

        RedeSocial redeSocial = new RedeSocial("01/01/2023", "usuario123", "01/01/1990", "senha123");
        redeSocial.inserePublicacao(pub1);
        redeSocial.inserePublicacao(pub2);
        redeSocial.inserePublicacao(pub3);

        redeSocial.imprimePublicacoes();
    }
}
