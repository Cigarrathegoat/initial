package vectorPractice;

import java.util.Scanner;

/**
 * Crie um programa em java que leia o nome e a nota de 10 candidatos
 * a uma bolsa de estudos. O programa deve apresentar apenas os nomes
 * dos alunos com a pontuação máxima (10), estes serão os alunos que receberão a bolsa.
 * 1. gather names and grades
 * 2. put those who got perfect 10s in an array
 * 3. display all elements in array.
 */
public class ScholarshipRecipients {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String name = "";
        double grade = 0;
        String nameVector[] = new String[10];
        double gradeVector[] = new double[10];
        int tens = 0;
        int counter = 0;

        do {
            System.out.println("Hello!  Please input your name:");
            name = sc.next();
            System.out.println("Thank you! Now please input your grade:");
            grade = sc.nextDouble();

            nameVector[counter] = name;
            gradeVector[counter] = grade;
            counter++;
        } while (counter < 10);

        System.out.println("The scholarship recipients are the following studets:");

        for (int i = 0; i < gradeVector.length; i++) {
            if (gradeVector[i] == 10) {
                System.out.println(nameVector[i]);
            }
        }

    }
}
