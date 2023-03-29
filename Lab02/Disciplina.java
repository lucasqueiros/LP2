package lab02;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private double[] notas = new double[4];
    private int horas;


    double media;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas){
        this.horas = horas;
    }

    public void cadastraNota(int nota, double valorNota){
        notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        if (media >= 7){
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nomeDisciplina + '\'' +
                ", notas=" + Arrays.toString(notas) +
                ", horas=" + horas +
                ", media=" + media +
                '}';
    }


}
