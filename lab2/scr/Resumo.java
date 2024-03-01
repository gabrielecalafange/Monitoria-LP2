public class Resumo {

    private String tema;
    private String resumo;

    public Resumo (String tema, String resumo) {
        this.tema = tema;
        this.resumo = resumo;
    }

    public String getTema() {
        return this.tema;
    }

    @Override
    public String toString() {
        return this.tema + ": " + this.resumo;
    }
}
