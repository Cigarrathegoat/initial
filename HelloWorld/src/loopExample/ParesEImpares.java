package loopExample;

import java.util.Scanner;

/**
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 * Para esse exercícios verificar a tulização do operador "%"(mod)
 * quando vc faz uma divisão utilizando o "%" o resultado será o resto da divisão inteira, ex.:
 * int result = 2%2; // -> result == 0
 * o resultado dessa operação é 0 (zero), pois o resto da divisão de 2 por 2 é zero.
 *
 * 1. gather the numbers
 * 2. establish variable for total of even numbers and odd numbers
 * 3. place even and odd numbers as added instance in each variable
 * 4. print total number of even and odd numbers
 */

public class ParesEImpares {

    public static void main(String[] args) {

        Scanner numberReader = new Scanner(System.in);

        int evenNumbers = 0;
        int oddNumbers = 0;
        String toBeOne = "";
        String toBeTwo = "";

        for (int i = 0; i <= 9; i++) {
            System.out.println("Please input a random number:");
            int nextRandomNumber = numberReader.nextInt();
            if (nextRandomNumber % 2 == 0) {
                evenNumbers++;
            }
            else {
                oddNumbers++;
            }

        }
        if (evenNumbers == 1) {
            toBeOne = "is";
        }
        else {
            toBeOne = "are";
        }
        if (oddNumbers == 1) {
            toBeTwo = "is";
        }
        else {
            toBeTwo = "are";
        }
        System.out.println("Of all numbers inputted, " + evenNumbers + " " + toBeOne + " even and " + oddNumbers
                + " " + toBeTwo + " odd.");
    }
}

















