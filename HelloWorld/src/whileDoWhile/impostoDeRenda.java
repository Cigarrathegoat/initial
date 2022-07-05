package whileDoWhile;

import java.util.Scanner;

/**
 * Faça um programa que se repita ate o operador selecionar para sair (do - while),
 * nesse programa o operador deve selecionar qual tipo de pessoa ele quer fazer
 * o calculo de imposto de renta, fisica ou juridica. Quando o operador selecionar
 * um das 2 opções o programa deve se repetir até o operador desejar sair (while).
 *
 * Dica, são 3 laços:
 * 1 o que repete todo o programa
 * 2 o de pessoa fisica
 * 3 o de pessoa jurídica
 *
 *
 */
public class impostoDeRenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my tax calculator!");

        double monthlySalary = 0;
        int typeOfPerson = 0;
        double tax = 0;
        String goAgain = "";

        do {
            System.out.println("Are you a physical or a juridical person?\n " +
                    "Please type 1 for physical and 2 for juridical:");
            typeOfPerson = scanner.nextInt();

            if (typeOfPerson == 1) {
                System.out.println("Please input your monthly earnings amount:");
                monthlySalary = scanner.nextDouble();
                if (monthlySalary <= 1903.98) {
                    tax = (monthlySalary * 12) * 0;
                } else if (monthlySalary >= 1903.98 && monthlySalary <= 2826.65) {
                    tax = (monthlySalary * 12) * 0.075;
                } else if (monthlySalary >= 2826.66 && monthlySalary <= 3751.05) {
                    tax = (monthlySalary * 12) * 0.15;
                } else if (monthlySalary >= 3751.05 && monthlySalary <= 4664.68) {
                    tax = (monthlySalary * 12) * 0.225;
                } else {
                    tax = (monthlySalary * 12) * 0.275;
                }
                System.out.println("Based on your monthly earnings, your tax amount this year is $" + tax + ".");
            } else if (typeOfPerson == 2) {
                System.out.println("Please input your monthly earnings amount:");
                monthlySalary = scanner.nextDouble();
                if (monthlySalary < 5000) {
                    tax = (monthlySalary * 12) * 0;
                } else if (monthlySalary >= 5000 && monthlySalary < 20000.00) {
                    tax = (monthlySalary * 12) * 0.06;
                } else {
                    tax = (monthlySalary * 12) * 0.15;
                }
                System.out.println("Based on your business' monthly earnings, its tax this year is $" + tax + ".");
            }
            System.out.println("Would you like to do this again?\n" +
                    "Please type Y for yes and N for no:");
            goAgain = scanner.next();
        } while (goAgain.equals("y"));
        System.out.println("Thank you for using my tax calculator!");

            }
        }
