import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;
    private double[] notas = new double[4];
    private int horas;
    public Disciplina (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horas += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }

    public boolean aprovado() {
        return calculamedia() >= 7.0;
    }

    private double calculamedia() {
        double media = 0;
        for (double nota: notas) {
            media += nota;
        }
        return media/4;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horas + " " + calculamedia() + " " + Arrays.toString(notas);
    }
}
