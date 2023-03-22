import java.util.Arrays;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Lucas Queirós - 121210354
 */
public class Wally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while (true) {
            String[] nomes = sc.nextLine().split(" ");
                if (nomes[0].equals("wally")) {
                    break;
                }
            String nomewally = "null";
            for (int j = 0; j < nomes.length; j++) {
                if (nomes[j].length() == 5) {
                    nomewally = nomes[j];
                }
            }
            if (nomewally.equals("null")) {
                System.out.println("?");
            } else System.out.println(nomewally);
        }
    }
}
