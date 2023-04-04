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
     * @param tema  tema do resumo.
     * @param texto texto contido no resumo.
     */
    public void adiciona(String tema, String texto) {
        if (contador >= 100) {
            temas[contador - 100] = tema;
            textos[contador - 100] = texto;
            contador++;
            return;
        }
        for (int i = 0; i <= numeroDeResumos - 1; i++) {
            if (temas[i] == null) {
                temas[i] = tema;
                textos[i] = texto;
                contador++;
                break;
            }
        }
    }

    /**
     * Retorna um array de Strings que representa os temas e os resumos cadastrados.
     *
     * @return array listando os temas e resumos
     */
    public String[] pegaResumos() {
        String[] temaresumo = new String[temas.length];
        for (int i = 0; i < temas.length; i++) {
            temaresumo[i] = temas[i] + ": " + textos[i];
        }
        return temaresumo;
    }

    /**
     * Retorna a String que representa o status atual do registro de resumos.
     *
     * @return representação de quantos resumos foram registrados e seus respectivos temas.
     */
    public String imprimeResumos() {
        int contador = 0;
        StringBuilder sb = new StringBuilder();
        for (String s : temas) {
            if (s != null) {
                contador++;
            }
        }
        System.out.println("- " + contador + " resumo(s) cadastrado(s)");
        sb.append("- ");
        for ( int i = 0; i < temas.length; i++) {
            if (temas[i] != null) {
                sb.append(temas[i]);
                if (temas[i + 1] != null) {
                    sb.append(" | ");
                } else break;
            }else continue;
        }
        return sb.toString();
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
    public boolean temResumo(String tema) {
        for (String s : temas) {
            if (s != null) {
                if (s.equals(tema)) {
                    return true;
                }
            }
        }
        return false;
    }
}

