/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Lucas Queirós - 121210354
 */

import java.util.Scanner;

public class DobroETriplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        System.out.println("dobro: " + (num1 * 2) + ", triplo: " + (num1 * 3));
    }
}
