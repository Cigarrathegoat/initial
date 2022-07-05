package totalSalaryCalculator;


import java.util.Scanner;

/**
 * Dado o valor da hora e a quantidade de horas,
 * escreva um programa que calcule o valor do salário
 * e escreva o resultado na tela.
 */
public class TotalSalaryCalculator {

    /*
    1. read hour value from keyboard
    2. read hour quantity from keyboard
    3. multiply hour value by hour quantity
    4. write result on screen
     */
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);
        System.out.println("Please input your hourly wage below:");
        float hourlyWage = keyboardReader.nextFloat();
        System.out.println("Please input your total number of hours worked:");
        int hoursWorked = keyboardReader.nextInt();
        double salary = hourlyWage * hoursWorked;
        System.out.println("Your total salary is: "+salary+".");
    }
}
