package lab02;

/**
 * Representação de registro de descanso do aluno.
 * O aluno começa cansado e precisa ter um minimo de 26 horas por semana para estar descansado.
 *
 * @author Lucas Queirós
 */
public class Descanso {

    /**
     * Numero de horas descansadas.
     */
    private int horasDescanso;

    /**
     * Número de semanas para contabilizar o descanso.
     */
    private int numeroSemanas;

    /**
     * String que retorna se o aluno está cansado ou descansado.
     */
    private String StatusGeral;

    /**
     * Constrói uma Registro de descanso do aluno.
     * O aluno começa com seu status geral de cansado.
     */
    public Descanso() {
        this.StatusGeral = "cansado";
    }

    /**
     * Seta horas de descanso.
     *
     * @param horasDescanso horas de descanso.
     */
    public void defineHorasDescanso(int horasDescanso) {

        this.horasDescanso = horasDescanso;
    }

    /**
     * Seta o numero de semanas.
     *
     * @param numSemanas numero de semanas.
     */
    public void defineNumeroSemanas(int numSemanas) {

        this.numeroSemanas = numSemanas;
    }

    /**
     * Retorna o status geral após realizar um teste para saber se o aluno está cansado.
     *
     */
    public String getStatusGeral() {
        if (numeroSemanas == 0){
            return StatusGeral;
        } else {
            int horasPorSemana = horasDescanso / numeroSemanas;
            if (horasPorSemana >= 26) {
                setStatusGeral("descansado");}
            else setStatusGeral("cansado");
        }
        return StatusGeral;
    }

    /**
     * Seta o status geral.
     *
     * @param statusGeral uma string que diz se o aluno está cansado ou não.
     */
    public void setStatusGeral(String statusGeral) {
        StatusGeral = statusGeral;
    }
}
