package lab02;

import java.util.Arrays;

public class RegistroResumos {
    private int numeroDeResumos;
    private String[] resumos;
    private String[] temas;

    private int contador = 0;


    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.resumos = new String[numeroDeResumos];
        this.temas = new String[numeroDeResumos];
    }

    public void adiciona(String tema, String resumo){
        if (contador >= 100) {
            temas[contador - 100] = tema;
            resumos[contador - 100] = resumo;
            contador ++;
            return;
        }
        for(int i = 0; i <= numeroDeResumos - 1; i++) {
            if (temas[i].equals(null)){
            temas[i] = tema;
            resumos[i] = resumo;
            contador ++;
            break;
            }
        }

    }

    public String[] pegaResumos(){
        return this.resumos;
    }

    public String imprimeResumos() {
        return "Resumos:" + "\n" + "- " + contador + "resumo(s) cadastrado(s)" + "\n" +
                "- " + Arrays.toString(temas);
    }

    public int conta() {
        if (contador >= 100) {
            return 100;
        }
        return contador;
    }

    public boolean temResumo(String tema){
       for (String s : temas) {
           if (s.equals(tema)){
               return true;
           }
       }return false;
    }

}
