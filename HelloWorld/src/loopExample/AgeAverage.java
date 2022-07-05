package loopExample;

import java.util.Scanner;

/**
 * Leia 5 idades e calcule a média entre as idades lidas
 *1. get the ages
 *2. rum a sum += age
 *3. display result
 */
public class AgeAverage {

    public static void main(String[] args) {

        Scanner ageScanner = new Scanner(System.in);
        int ageSum = 0;

        for (int i = 0; i <5; i++) {
            System.out.println("Please input your age:");
            int age = ageScanner.nextInt();
            ageSum += age;
        }
        int ageAverage = ageSum / 5;
        System.out.println("the age average between all five people surveyed is " + ageAverage + ".");
    }
}
