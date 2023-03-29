package lab02;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int horasSemanais;

    public RegistroTempoOnline(String nomeDisciplina, int horasSemanais) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasSemanais = horasSemanais;
    }

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void adicionaTempoOnline(int tempo) {
        this.horasSemanais = tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        if (horasSemanais >= 120) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "RegistroTempoOnline{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", horasSemanais=" + horasSemanais +
                '}';
    }
}

