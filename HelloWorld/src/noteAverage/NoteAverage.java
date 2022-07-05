package noteAverage;


import java.util.Scanner;

/**
 * Escreva um programa que a partir de 3 notas,
 * calcule a média e exiba o resultado na tela dessa média.
 */
public class NoteAverage {

    /*
    1. read first grade from the screen
    2. read second grade from the screen
    3. read third grade from the screen
    4. gather average from three results read
    6. display result
     */

    public static void main(String[] arg) {
        Scanner gradeReader = new Scanner(System.in);
        System.out.println("Please input your first grade:");
        double firstGrade = gradeReader.nextDouble();
        System.out.println("Please input your second grade:");
        double secondGrade = gradeReader.nextDouble();
        System.out.println("Please input your third grade:");
        double thirdGrade = gradeReader.nextDouble();

        double gradeAverage = (firstGrade + secondGrade + thirdGrade) / 3;
        System.out.println("Your grade average is: "+gradeAverage+".");
    }
}
