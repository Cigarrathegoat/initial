package dudesSalary;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Crie um algoritmo que leia o valor do salário mínimo
 * e o valor do salário de um usuário, calcule a quantidade
 * de salários mínimos esse usuário ganha e imprima o resultado.
 * 1. Find out minimum wage
 * 2. Find out man's salary
 * 3. Divide man's salary by minimum wage;
 * 4. Display result
 */
public class DudesSalary {

    public static void main(String[] args) {

        Scanner moneyCounter = new Scanner(System.in);

        System.out.println("Please input your monthly salary:");
        double salary = moneyCounter.nextDouble();
        System.out.println("Please input current value of minimum wage:");
        double minWage = moneyCounter.nextDouble();

        double salaryInMinWages = salary / minWage;

        System.out.println("Your salary is worth " + new DecimalFormat("##").format(salaryInMinWages) + " minimum wages.");
    }
}
