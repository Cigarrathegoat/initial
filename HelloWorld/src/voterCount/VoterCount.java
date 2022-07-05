package voterCount;
import java.util.Scanner;


/**2.  Escreva um algoritmo para ler o número total de eleitores de um município
 * o número de votos brancos, nulos e válidos.
 * Calcular e escrever o percentual que cada um representa em relação ao total
 de eleitores.
  **/
/*
1. Gather total voter count
2. Gather all valid, blank and null votes
3. Calculate which ones are percentages of what
 */

public class VoterCount {

    public static void main(String[] arg) {

        Scanner counter = new Scanner(System.in);

        System.out.println("Please input number of total voters in the city:");
        float totalVotes = counter.nextInt();
        System.out.println("Please input number of valid votes:");
        float validVotes = counter.nextInt();
        System.out.println("Please input number of blank votes:");
        float blankVotes = counter.nextInt();
        System.out.println("Please input number of null voters:");
        float nullVotes = counter.nextInt();

        double percentageOfValidVotes = (validVotes / totalVotes) * 100;
        double percentageOfBlankVotes = (blankVotes / totalVotes) * 100;
        double percentageOfNullVotes = (nullVotes / totalVotes) *100;

        System.out.println("Valid votes represented " + percentageOfValidVotes + " of total electorate.");
        System.out.println("Blank votes represented " + percentageOfBlankVotes + " of total electorate.");
        System.out.println("Null votes represented " + percentageOfNullVotes + " of total electorate");


    }
}
