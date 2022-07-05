package vectorPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Dado o array [8,2,4,6,1,9], escreva um programa que ordene o array de forma decrescente.
 * 1. establish array
 * 2. call Arrays.sort(name, Collections.reverseOrder());
 * 3. print out Arrays.toString(name)
 */
public class NumbersReverseOrder {

    public static void main(String[] args) {

        /**
         * Scanner sc = new Scanner(System.in);
         *
         *         int randomNumbers[] = {8,2,4,6,1,9};
         *
         *         int temp = 0;    //Temporary variable to store the element
         *
         *         for (int i = 0; i < randomNumbers.length; i++)   //Holds each Array element
         *         {
         *             for (int j = i+1; j < randomNumbers.length; j++)    //compares with remaining Array elements
         *             {
         *                 if(randomNumbers[i] < randomNumbers[j]) //Compare and swap
         *                 {
         *                     temp = randomNumbers[i];
         *                     randomNumbers[i] = randomNumbers[j];
         *                     randomNumbers[j] = temp;
         *                 }
         *             }
         *         }
         *
         *         System.out.println();
         *
         *         //Displaying elements of array after sorting
         *         System.out.println("Elements of array sorted in descending order: ");
         *         for (int i = 0; i < randomNumbers.length; i++)
         *         {
         *             System.out.print(randomNumbers[i] + " ");
         *         }
         */

        int randomNumbers[] = {23, 54, 678, 65, 28, 97, 657, 78, 29, 876, 45};

        int temp = 0;

        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = i + 1; j < randomNumbers.length; j++) {
                if (randomNumbers[i] < randomNumbers[j]) {
                    temp = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[j];
                    randomNumbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
    }
    }
