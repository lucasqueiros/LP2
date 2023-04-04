package lab02;

import java.util.Arrays;
/**
 * Representação de uma disciplina acadêmica.
 * Uma disciplina possui nome, notas e quantidade de horas de estudo.
 *
 * @author Lucas Queirós
 */
public class Disciplina {
    /**
     * Nome da disciplina
     */
    private String nomeDisciplina;

    /**
     * Array contendo as notas da disciplina.
     */
    private double[] notas;

    /**
     * Quantidade de horas de estudo na disciplina.
     */
    private int horas;

    /**
     * Média da disciplina.
     */
    double media;

    /**
     * Constrói uma disciplina a partir do nome.
     * As horas de estudo, por padrão, é 0.
     * O Array de notas, por padrão, possui 4 notas 0.
     *
     * @param nomeDisciplina nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.media = 0;
        this.notas = new double[4];
    }

    /**
     * Adiciona horas a quantidade de horas de estudo da disciplina.
     *
     * @param horas quantidade de horas
     */
    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    /**
     * Cadastra uma nota na disciplina.
     *
     * @param nota qual nota vai ser cadastrada
     * @param valorNota valor da nota
     */
    public void cadastraNota(int nota, double valorNota){
        notas[nota - 1] = valorNota;
    }

    /**
     * Retorna o resultado da seguinte verificação:
     * A média das notas é maior ou igual a 7.
     * Se a verificação for verdadeira então a disciplina esta, aprovada.
     *
     * @return disciplina aprovada ou reprovada
     */
    public boolean aprovado() {
        calculaMedia();
        if (media >= 7){
            return true;
        } else return false;
    }

    /**
     * Retorna a String que representa a disciplina.
     * A representação segue o seguinte formato:
     * "Nome da disciplina Horas de estudo na disciplina Media na disciplina [Notas na disciplina]"
     *
     * @return representação da disciplina em String
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + horas + " " + media + " " + Arrays.toString(notas);
    }

    public double calculaMedia() {
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media = media / 4;
        return media;
    }

}
