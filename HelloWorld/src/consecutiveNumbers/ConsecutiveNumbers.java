package consecutiveNumbers;
import java.util.Scanner;

/**Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
 * 1. Get number
 * 2. put number with ++ after for number following and -- after for numbers preceding
 * 3. display results
 */
public class ConsecutiveNumbers {

    public static void main (String[] args) {
                Scanner numberReader = new Scanner(System.in);
        System.out.println("Please input a number:");
        int mainNumber = numberReader.nextInt();
        System.out.println("The number that precedes your number is: " + (mainNumber - 1));
        System.out.println("The number that follows your number is: " + (mainNumber + 1));


    }
}
