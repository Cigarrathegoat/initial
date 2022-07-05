package vectorPractice;

import java.util.Scanner;

public class TaxVectorPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input info variables:
        String name = "";
        double salary = 0;
        double tax = 0;

        //vector variables:
        String nameVector[] = new String[10];
        double salaryVector[] = new double[10];
        double taxVector[] = new double[10];
        int counter = 0;
        //variable to stop:
        String doIStop = "";

        //finder variables:
        String highestPayer = "";
        double highestPayerSalary = 0;
        String lowestPayer = "";
        double lowestPayerSalary = 0;
        double highestTax = 0;
        double lowestTax = 0;

        double taxSum = 0;

        do {
            System.out.println("Please input your name:");
            name = scanner.next();
            System.out.println("Please input your salary:");
            salary = scanner.nextDouble();

            tax = (salary * 12) * 0.12;
            System.out.println("Your tax due is $ " + tax + ".");

            nameVector[counter] = name;
            salaryVector[counter] = salary;
            taxVector[counter] = tax;
            counter++;


            System.out.println("Would you like to continue? Please type 'no' to stop.");
            doIStop = scanner.next();

        } while (!doIStop.equals("no") && counter <= 9);

        highestTax = taxVector[0];
        lowestTax = taxVector[0];

        for (int i = 0; i <= 9; i++) {
            if (lowestTax > taxVector[i]) {
                lowestPayer = nameVector[i];
                lowestPayerSalary = salaryVector[i];
                lowestTax = taxVector[i];
            }
            if (highestTax < taxVector[i]) {
                highestPayer = nameVector[i];
                highestPayerSalary = salaryVector[i];
                highestTax = taxVector[i];
            }
            taxSum += taxVector[i];
        }
        System.out.println("The highest tax paid was by " + highestPayer + ", who earned "
                + highestPayerSalary + " and paid $" + highestTax + ".");
        System.out.println("The lowest tax paid was by " + lowestPayer + ", who earned "
                + lowestPayerSalary + " and paid $" + lowestTax + ".");
        System.out.println("The average of all taxes paid is $" + (taxSum / 10) + ".");
    }
}
