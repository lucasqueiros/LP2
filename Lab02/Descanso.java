package lab02;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;
    private String StatusGeral;

    public Descanso() {}

    public int getHorasDescanso() {
        return horasDescanso;
    }

    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public int getNumeroSemanas() {
        return numeroSemanas;
    }

    public void defineNumeroSemanas(int numSemanas) {
        this.numeroSemanas = numSemanas;
    }

    public String getStatusGeral() {
        return StatusGeral;
    }

    public void setStatusGeral(String statusGeral) {
        StatusGeral = statusGeral;
    }
}
