package loopExample;

import java.util.Scanner;

public class AverageOfAllSalaries {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("How many employees does your company have?");
        int headCount = data.nextInt();
        double allSalaries = 0;

        for (int i = 0; i < headCount; i++) {

            System.out.println("Please input your name:");
            String employeeName = data.next();
            System.out.println("Please input your salary:");
            double employeeSalary = data.nextDouble();
            allSalaries += employeeSalary;
        }
        double salaryAverage = allSalaries / headCount;
        System.out.println("the compensation average at your company is $" + String.format("%.2f", salaryAverage));
    }
}
