package vectorPractice;

import java.util.Scanner;

/**
 *
 *Escreva um main Java que solicita 8 inteiros ao usuário
 * e guarda esses valores em um array. Depois o programa deve descobrir
 * e exibir qual a posição do elemento de maior valor.
 * 1. establish variables
 * 2. do a for loop 8 times asking for number inputs
 * 3. put such responses as counter in vectors
 * 4. establish another four counting up the vector numbers
 * 5. make a highest number variable and have the highest number substitute it
 * 6. display highest number
 */

public class HighestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numInput = 0;
        int numVector[] = new int[8];
        int counter = 0;
        int highestNumber = 0;

        do {
            System.out.println("Please input a random number:");
            numInput = sc.nextInt();

            numVector[counter] = numInput;
            counter++;
        } while (counter <= 7);
        highestNumber = numVector[0];

        for(int j = 0; j <= 7; j++) {
            if (highestNumber < numVector[j]) {
                highestNumber = numVector[j];
            }
        }
        System.out.println("The highest number in the series is " + highestNumber + ".");

    }



}
