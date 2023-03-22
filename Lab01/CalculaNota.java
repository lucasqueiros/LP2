/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Lucas Queirós - 121210354
 */
import java.util.Scanner;

public class CalculaNota {
    public static void main(String[] args) {
        int maior = 0;
        int menor = 1000;
        int media = 0;
        int contador = 0;
        int acima = 0;
        int abaixo = 0;
        String aluno;
        int nota = 0;
        int soma = 0;

        Scanner sc = new Scanner(System.in);


        while (true) {
            aluno = sc.nextLine();
            if (aluno.equals("-")) {
                break;
            }
            nota = Integer.parseInt(aluno.replaceAll("(?:[^0-9]+)", ""));
            soma += nota;
            contador++;
            media = soma / contador;
            if (nota > maior){
                maior = nota;
            } if (nota < menor) {
                menor = nota;
            } if (nota >= 700) {
                acima += 1;
            } if (nota < 700) {
                abaixo += 1;
            }
        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);
    }
}
