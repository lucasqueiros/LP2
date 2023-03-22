import java.util.Arrays;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Lucas Queirós - 121210354
 */
public class MediaArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String linha = sc.nextLine();

        String[] numeros = linha.split(" ");
        int[] num = new int[numeros.length];

        
        int soma = 0;
        int cont = 0;


        for (int i = 0; i < numeros.length; i++) {
            num[i] = Integer.valueOf(numeros[i]);
        }

       for (int j = 0; j < num.length; j++) {
            soma += num[j];
            cont += 1;
        }
       for (int k =0; k <num.length; k++) {
           if (num[k] > (soma / cont)) {
               System.out.print(num[k] + " ");
           }
       }

    }
}
