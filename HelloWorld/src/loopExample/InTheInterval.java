package loopExample;

import java.util.Scanner;

/**
 * faça um programa que receba 10 números e conte quantos deles estão no intervalo [5,25]
 * e quantos deles estão fora do intervalo, ao final do programa deve-se apresentar
 * a quantidade que esta dentro do intervalo e a quantidade que esta fora.
 * 1. establish variables for numbers in and out of spectrum (from 5 to 25)
 * 2. run loop asking for numbers
 * 3. Add instance to appropriate variable with every number
 * 4. display result
 */

public class InTheInterval {

    public static void main(String[] args) {

        Scanner numberReader = new Scanner(System.in);

        int withinInterval = 0;
        int outOfInterval = 0;

        for (double i = 0; i <= 9; i++) {
            System.out.println("Please input a number:");
            double numberInput = numberReader.nextDouble();

            if (numberInput >= 5 && numberInput <= 25) {
                withinInterval++;
            }
            else {
                outOfInterval++;
            }
        }

        System.out.println("Amount of numerals within the established interval: " + withinInterval + ".");
        System.out.println("Amount of numerals outside the established interval: " + outOfInterval + ".");
    }
}
