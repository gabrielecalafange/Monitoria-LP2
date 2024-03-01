public class RegistroTempoOnline {

    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoUsado;

    public RegistroTempoOnline (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }

    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoUsado += tempo;
    }
    public boolean atingiuMetaTempoOnline() {
        return this.tempoUsado >= this.tempoOnlineEsperado;
    }
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + tempoUsado + "/" + this.tempoOnlineEsperado;
    }

}
