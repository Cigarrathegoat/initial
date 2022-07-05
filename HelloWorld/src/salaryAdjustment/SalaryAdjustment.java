package salaryAdjustment;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Escreva um algoritmo para ler o salário mensal atual
 * de um funcionário e o percentual de reajuste.
 * Calcular e escrever o valor do novo salário.
 */
/*
1. Get worker's monthly salary
2. Get readjustment
3. Add salary to readjustment
4. Write employee's new salary
 */
public class SalaryAdjustment {

    public static void main(String[] arg) {

        Scanner newSalary = new Scanner(System.in);
        System.out.println("Please input employee salary, in numerals only:");
        float oldSalary = newSalary.nextFloat();
        System.out.println("Please input, only in numeral, the adjustment percentage:");
        float adjustment = newSalary.nextFloat();
        float adjustmentValue = (adjustment / 100) * oldSalary;
        float finalSalary = oldSalary + adjustmentValue;

        System.out.println("Your salary after adjustment is now $" + new DecimalFormat(".##").format(finalSalary) + ".");

    }
}
