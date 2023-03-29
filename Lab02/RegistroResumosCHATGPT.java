package lab02;

import java.util.ArrayList;
import java.util.List;

public class RegistroResumosCHATGPT {
    private int numeroDeResumos;
    private List<String[]> resumos;

    public RegistroResumosCHATGPT(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.resumos = new ArrayList<>();
    }

    public void adiciona(String tema, String resumo) {
        for (String[] registro : resumos) {
            if (registro[0].equals(tema)) {
                registro[1] = resumo;
                return;
            }
        }
        if (resumos.size() >= numeroDeResumos) {
            // remove o primeiro resumo cadastrado para dar lugar ao novo
            resumos.remove(0);
        }
        String[] novoRegistro = {tema, resumo};
        resumos.add(novoRegistro);
    }

    public List<String> pegaResumos() {
        List<String> resumosList = new ArrayList<>();
        for (String[] registro : resumos) {
            resumosList.add(registro[1]);
        }
        return resumosList;
    }

    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        for (String[] registro : resumos) {
            sb.append(registro[0]).append(": ").append(registro[1]).append("\n");
        }
        return sb.toString();
    }

    public int conta() {
        return resumos.size();
    }

    public boolean temResumo(String tema) {
        for (String[] registro : resumos) {
            if (registro[0].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}

