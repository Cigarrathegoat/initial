package vectorPractice;

import java.util.Scanner;

/**
 * Um concurso de culinaria vai ser executado e 5 participantes estão na final,
 * essa final consiste em 3 etapas, cada etapa concede uma nota de 0 à 10.
 * Escreva um programa que leia o nome do participante e a nota em cada etapa
 * e ao final calcule a soma das notas e defina quem foi o vencedor,
 * exiba o vencedor e também mostre o nome e a pontuação de cada participante individualmente.
 *
 * 1. gather cook info
 * 3. sum three scores for each
 * 2. put all in a vector
 * 3. run a standard winner loop
 * 4. print out champion
 * 5. display all other participants using
 *
 */
public class WinningCook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contestant = "";
        String contestantVector[] = new String[5];
        double firstScore = 0;
        double secondScore = 0;
        double thirdScore = 0;
        double finalScore = 0;
        double finalScoreVector[] = new double[5];
        int counter = 0;
        String champion = "";
        double championScore = 0;

        for (int i = 0; i < 5; i++) {
        System.out.println("Please input the contestant's name:");
        contestant = sc.next();
        System.out.println("Please input the contestant's first score:");
        firstScore = sc.nextDouble();
        System.out.println("Please input the contestant's second score");
        secondScore = sc.nextDouble();
        System.out.println("Please input the contestant's third score:");
        thirdScore = sc.nextDouble();

        finalScore = firstScore + secondScore + thirdScore;

        contestantVector[counter] = contestant;
        finalScoreVector[counter] = finalScore;
        counter++;
    }
        for (int j = 0; j < finalScoreVector.length; j++) {
            if (championScore < finalScoreVector[j]) {
                champion = contestantVector[j];
                championScore = finalScoreVector[j];
            }


            }
        System.out.println("this ediditon's winner is " + champion + ", with a score of " + championScore + ".");
        System.out.println("Below is every contestant with their individual scores:");

        double temp = 0;

        for (int k = 0; k < finalScoreVector.length; k++) {
            for (int l = k + 1; l < finalScoreVector.length; l++) {
                if (finalScoreVector[k] < finalScoreVector[l]) {
                    temp = finalScoreVector[k];
                    finalScoreVector[k] = finalScoreVector[l];
                    finalScoreVector[l] = temp;

                }
            }
        }
        for (int k = 0; k < finalScoreVector.length; k++) {
            System.out.println(contestantVector[k] + ": " + finalScoreVector[k]);
        }
        }
}
