package vectorPractice;

import java.util.Arrays;

/**
 * Dado o array [8,2,4,6,1,9], escreva um programa que ordene o array de forma crescente.
 *
 * 1. establish array
 * 2. apply Arrays.sort()
 * 3. Print result
 *
 */
public class NumbersInOrder {

    public static void main(String[] args) {

        int randomNumbers[] = {8,2,4,6,1,9};
        Arrays.sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
    }
}
