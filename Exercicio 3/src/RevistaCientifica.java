public class RevistaCientifica {
    private String titulo;
    private long issn;
    private String periodicidade;
    private Edicao edicao;

    public RevistaCientifica(String titulo, long issn, String periodicidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.periodicidade = periodicidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public void adicionaEdicao(Edicao edicao) {
        this.edicao = edicao;
    }

    public Edicao getEdicao() {
        return edicao;
    }
}
