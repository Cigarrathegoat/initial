package IfExercise;

import java.util.Scanner;

/**
 * Our team was hired by a countrytaht has just coe into existenc. they want us to declare their taxes
 * 1. they will put their yearly salary range
 * 2. We are going to have to calculate their taxes
 * 3. <= 60 k = 12.5 %
 * 4. 60k - 80k = 25 %
 * 5. > 80k = 30%
 *
 */
public class IfExercise {
    public static void main(String[] args) {
        Scanner salaryChecker = new Scanner(System.in);
        System.out.println("Please input your salary");
        double salary = salaryChecker.nextDouble();
        double  taxResult = 0;

        if(salary <= 60000) {
            taxResult = salary * 0.125;
        }
        else if (salary > 60000 && salary <= 80000) {
            taxResult = salary * 0.25;
        }
        else {
            taxResult = salary * 0.30;
        }
        System.out.println("Your taxes are $" + taxResult + ".");
    }
}
