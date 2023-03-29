package lab02;

import java.util.Arrays;

/**
 * Representação de um Registro de resumos.
 * Cada registro possui um limite especificos de resumos definidos na inicialização.
 * cada resumo contem um tema e um texto.
 *
 * @author Lucas Queirós
 */
public class RegistroResumos {

    /**
     * Número máximo de resumos.
     */
    private int numeroDeResumos;

    /**
     * Array contendo os textos anotados no resumo.
     */
    private String[] textos;

    /**
     * Array contendo os temas dos resumos.
     */
    private String[] temas;

    /**
     * Variavel contadora necessária para manutençao da classe.
     */
    private int contador = 0;

    /**
     * Constrói uma Registro de resumos a partir do numero máximo de resumos.
     * O Array de temas e o de texto possuem o tamanho do numero máximo de resumos
     *
     * @param numeroDeResumos numero máximo de resumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.textos = new String[numeroDeResumos];
        this.temas = new String[numeroDeResumos];
    }

    /**
     * Adiciona um resumo ao registro com tema e texto do resumo.
     *
     * @param tema tema do resumo.
     * @param texto texto contido no resumo.
     */
    public void adiciona(String tema, String texto){
        if (contador >= 100) {
            temas[contador - 100] = tema;
            textos[contador - 100] = texto;
            contador ++;
            return;
        }
        for(int i = 0; i <= numeroDeResumos - 1; i++) {
            if (temas[i].equals(null)){
            temas[i] = tema;
            textos[i] = texto;
            contador ++;
            break;
            }
        }

    }

    public String[] pegaResumos(){
        return this.textos;
    }

    /**
     * Retorna a String que representa o status atual do registro de resumos.
     *
     * @return representação de quantos resumos foram registrados e seus respectivos temas.
     */
    public String imprimeResumos() {
        return "Resumos:" + "\n" + "- " + contador + "resumo(s) cadastrado(s)" + "\n" +
                "- " + Arrays.toString(temas);
    }

    /**
     * Retorna o inteiro que representa o numero de resumos cadastrados.
     *
     * @return representação do tamanho do registro de resumos.
     */
    public int conta() {
        if (contador >= 100) {
            return 100;
        }
        return contador;
    }

    /**
     * Retorna o resultado da seguinte verificação:
     * A existencia de algum resumo cadastrado com o mesmo tema passado como parametro.
     *
     * @param tema tema do resumo.
     * @return true ou false baseado na verificação.
     */
    public boolean temResumo(String tema){
       for (String s : temas) {
           if (s.equals(tema)){
               return true;
           }
       }return false;
    }

}
