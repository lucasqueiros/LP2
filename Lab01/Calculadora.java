/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Lucas Queirós - 121210354
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operacao = sc.nextLine();

        if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")){
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            if (operacao.equals("+")) {
                System.out.println("RESULTADO: " + (num1 + num2));
            } else if (operacao.equals("-")) {
                System.out.println("RESULTADO: " + (num1 - num2));
            }else if (operacao.equals("*")) {
                System.out.println("RESULTADO: " + (num1 * num2));
            } else if (operacao.equals("/")) {
                if (num2 == 0) {
                    System.out.println("ERRO");
                } else {
                System.out.println("RESULTADO: " + (num1 / num2));
                }
            }
        } else System.out.println("ENTRADA INVALIDA");
    }
}
