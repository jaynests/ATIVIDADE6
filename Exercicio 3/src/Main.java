public class Main {
    public static void main(String[] args) {
        Artigo artigo1 = new Artigo("Título do Artigo 1", "Resumo do Artigo 1", "Autor 1, Autor 2");
        Artigo artigo2 = new Artigo("Título do Artigo 2", "Resumo do Artigo 2", "Autor 3, Autor 4");
        Edicao edicao = new Edicao(1, 2, "01/01/2022", 1000);
        edicao.adicionaArtigo(artigo1);
        edicao.adicionaArtigo(artigo2);
        RevistaCientifica revista = new RevistaCientifica("Título da Revista", 1234567890, "Mensal");
        revista.adicionaEdicao(edicao);
        System.out.println("Título da revista: " + revista.getTitulo());
        System.out.println("ISSN da revista: " + revista.getIssn());
        System.out.println("Periodicidade da revista: " + revista.getPeriodicidade());
        System.out.println("Número da edição: " + revista.getEdicao().getNumero());
        System.out.println("Volume da edição: " + revista.getEdicao().getVolume());
        System.out.println("Data da edição: " + revista.getEdicao().getDataEdicao());
        System.out.println("Tiragem da edição: " + revista.getEdicao().getTiragem());
        System.out.println("Artigos da edição:");
        for (Artigo artigo : revista.getEdicao().getArtigos()) {
            System.out.println("- Título: " + artigo.getTitulo());
            System.out.println("  Resumo: " + artigo.getResumo());
            System.out.println("  Autores: " + artigo.getAutores());
        }
    }
}
