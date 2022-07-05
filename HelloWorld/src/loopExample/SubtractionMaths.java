package loopExample;

import java.util.Scanner;

public class SubtractionMaths {

    public static void main(String[] args) {

        Scanner numberInput = new Scanner(System.in);

        for (double i = 0; i <= 2; i++) {
            System.out.println("Please input the first number in your subtraction:");
            double firstNumber = numberInput.nextDouble();
            System.out.println("Now input the amount you wouuld like to subtract from that original number:");
            double secondNumber = numberInput.nextDouble();
            double endResult = firstNumber - secondNumber;
            System.out.println("The result of your subtraction is " + endResult + ".");
        }

    }
    }

