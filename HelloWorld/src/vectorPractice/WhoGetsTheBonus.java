package vectorPractice;

import java.util.Scanner;

/**
 * Um time deseja verificar o melhor pontuador para dar
 * um bonus de 50% do seu salário a esse jogador, sabendo
 * que o time tem 8 jogadores, escreva um programa que leia o nome, salário
 * e a pontuação de cada jogador e ao final busque o melhor pontuador
 * e escreva seu nome e sua pontuação e o bonus.
 *
 * 1. Gather name salary and score of players;
 * 2. create an array of info
 * 3. create a for loop
 * 4. establish highest scorer
 * 5. if score checked is higher than highest scorer, substitute them
 * 6. print info
 */

public class WhoGetsTheBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String playerName[] = new String[8];
        double playerSalary[] = new double[8];
        int playerScore[] = new int[8];
        String name = "";
        double salary = 0;
        int score = 0;
        String highestScorer = "";
        double highestScorerSalary = 0;
        int highestScore = 0;
        double bonus = 0;
        int counter = 0;

        do {
            System.out.println("Please enter player's name:");
            name = sc.next();
            System.out.println("Please enter player's salary:");
            salary = sc.nextDouble();
            System.out.println("Please enter player's score:");
            score = sc.nextInt();

            playerName[counter] = name;
            playerSalary[counter] = salary;
            playerScore[counter] = score;
            counter++;
        } while (counter < 8);

        for (int i = 0; i < 8; i++) {
            if (highestScore < playerScore[i]) {
                highestScorer = playerName[i];
                highestScorerSalary = playerSalary[i];
                highestScore = playerScore[i];

                bonus = highestScorerSalary / 2;

            }
        }
        System.out.println("The highest scorer in your team is "
                + highestScorer + ", with a score of " + highestScore + ". A bonus of $"
                + bonus + " shall be awarded.");
    }
}
