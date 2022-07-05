package whileDoWhile;

/**
 * Cria uma calculadora com as seguites opções:
 * 1 - Soma
 * 2 - .Subtração
 * 3 - Divisão
 * 4 - Multiplicação
 *
 * O programa deve realizar o cálculo e perguntar se o usuário responder "Y" sim... o programa deve repetir o menu e realizar todo o procedimento.
 *
 * utilizar
 * do{
 * Código que se repete;
 * }while(condicao de parada);
 *
 * 1. set up a do while loop;
 * 2. gather 1st numbre
 * 3. gather operation symbol
 * 4. gather 2nd number
 * 5. ask if user wants to begin another calculation
 * 6. set affirmative answer as while condition
 *
 */

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        double result = 0;
        String goAgain = "";

        System.out.println("Hello! Welcome to my calculator!");

        do {
            System.out.println("Please input the first number in your calculation!");
            double firstNumber = calculator.nextDouble();
            System.out.println("Awesome, now it's time to input the operation sign you would like to use!\n" +
                    "Here is what they are, as a reminder:\n" +
                    "Addition: +\n" +
                    "Subtraction: -\n" +
                    "Multiplication: *\n" +
                    "Division: / \n" +
                    "Please input your desired operation sign now:");
            String operationSign = calculator.next();
            System.out.println("Wonderful! Now please type the final number in our operation:");
            double finalNumber = calculator.nextDouble();
            switch (operationSign) {
                case "+":
                    result = firstNumber + finalNumber;
                    break;
                case "-":
                    result = firstNumber - finalNumber;
                    break;
                case "*":
                    result = firstNumber * finalNumber;
                case "/":
                    result = firstNumber / finalNumber;
                    break;
                default: {
                    System.out.println("that's not one of the symbols accepted, sorry!");
                    }
            }
            System.out.println("Your result is " + result + ".");
            System.out.println("Would you like to make another calculation? Please type Y for yes and N for no:");
            goAgain = calculator.next();

        } while (goAgain.equals("Y"));

        System.out.println("Thank you for using my calculator!  Goodbye!");

    }
    }
