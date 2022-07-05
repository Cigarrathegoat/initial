package loopExample;

import java.util.Scanner;

/**
 * Escreva um programa que leia os nomes e as notas,
 * calcule a média dos 10 alunos da sala e escreva na tela para
 * cada aluno se ele está aprovado ou reprovado.
 */
public class GradesAverage {
    public static void main(String[] args) {
        Scanner studentInfo = new Scanner(System.in);
        int sum = 0;
        for (int iteration = 0; iteration < 10; iteration++) {
            System.out.println("Please input student name:");
            String studentName = studentInfo.next();
            System.out.println("PLease input the student's grade:");
            double studentGrade = studentInfo.nextDouble();
            sum += studentGrade;

            if (studentGrade < 7) {
                System.out.println (studentName + ", I am afraid you did not pass this class.");
            }
            else {
                System.out.println("Congratulations, " + studentName + "! You have passed this class!");

            }
        }
        System.out.println("The class average is " + (sum / 10) + ".");

    }
}

