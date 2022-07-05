package loopExample;

import java.util.Scanner;

/**
 * Faça um programa, utilizando for,
 * que peça para o usuário inserir um número N
 * e mostre na tela todos os números ímpares até N.
 * 1. get number
 * 2. run loop
 * 3. have pc find all numbers that, after being divided
 * into whole itegers, end up with non-zero remainders
 * 4. display results
 */
public class OddNumbersUntil {

    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        System.out.println("Please input a number below:");
        int inputNumber = numberReader.nextInt();
        System.out.println("All the numbers up until your chosen number are as follows:");
        for (int i = 1; i <= inputNumber; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
