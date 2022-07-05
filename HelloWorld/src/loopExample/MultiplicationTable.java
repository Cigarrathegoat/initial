package loopExample;

import java.util.Scanner;

/**
 * Faça um programa que mostre a tabuada de um número N (N será lido do teclado).
 * 1. Gather number;
 * 2. Run for loop starting at number gathered and ending at number gathered x 10;
 * 3. print out formula displaying number chosen times iteration
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner numberReader = new Scanner(System.in);
        System.out.println("Please input a number:");
        int numberInput = numberReader.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(numberInput + " times " +i+ " equals " + numberInput * i);
        }
    }
}
