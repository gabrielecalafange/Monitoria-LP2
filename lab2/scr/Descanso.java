public class Descanso {

    private int horas;
    private int semanas;

    public void defineHorasDescanso (int valor) {
        this.horas = valor;
    }

    public void defineNumeroSemanas (int valor) {
        this.semanas = valor;
    }

    public String getStatusGeral() {
        if (horas < 26 || semanas > 1 || horas == 0 && semanas == 0) {
            return "cansado";
        }
        return "descansado";
    }
}
