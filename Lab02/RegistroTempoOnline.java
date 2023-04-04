package lab02;

/**
 * Representação de registro de tempo online em uma disciplina.
 * Cada disciplina tem uma quantidade de horas a serem atingidas.
 *
 * @author Lucas Queirós
 */
public class RegistroTempoOnline {

    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;

    /**
     * Horas semanais registradas.
     */
    private int horasSemanais;

    /**
     * Numero de horas minimas da disciplina.
     */
    private int tempoOnlineEsperado;

    /**
     * Constrói uma Registro de tempo online a partir do nome da disciplina.
     *
     * @param nomeDisciplina nome da disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasSemanais = 0;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Constrói uma Registro de tempo online a partir do nome da disciplina e da quantidade minimas de horas.
     *
     * @param nomeDisciplina nome da disciplina.
     * @param tempoEsperado quantidade de horas minimas da disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasSemanais = 0;
        this.tempoOnlineEsperado = tempoEsperado;
    }

    /**
     * Adiciona o numero de horas a quantidade de horas acumuladas na disciplina.
     *
     * @param tempo horas adicionadas.
     */
    public void adicionaTempoOnline(int tempo) {
        this.horasSemanais += tempo;
    }

    /**
     * Retorna o resultado da seguinte verificação:
     * A quantidade de horas acumuladas é maior ou igual ao tempo online esperado da disciplina.
     *
     * @return true ou false baseado na verificação.
     */
    public boolean atingiuMetaTempoOnline() {
        return this.horasSemanais >= tempoOnlineEsperado;
    }

    /**
     * Retorna a String que representa o registro de tempo online no tempo atual.
     *
     * @return representação de quais disciplinas foram registradas e suas horas.
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + horasSemanais + "/" + tempoOnlineEsperado;
    }
}

