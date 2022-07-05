package loopExample;


import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
 * Fazer um algoritmo que calcule e escreva:
 *
 * a. a maior altura do grupo;
 * b. a menor altura do grupo;
 * c. média de altura dos homens;
 * d. o número de mulheres.
 *
 */
public class GenderHeightSurvey {
    public static void main(String[] args) {
        Scanner survey = new Scanner(System.in);

        double tallestHeight = 0;
        double shortestHeight = 50;
        String tallestPerson = "";
        String shortestPerson = "";
        double mensTotalHeight = 0;
        int womenInSurvey = 0;
        int menInSurvey = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Hello! Firstly, are you male or female?  Respond by inputing M for male, F for female and NA if you do not wish to answer!");
            String genderInfo = survey.next();
            System.out.println("Thank you!  Please input your name:");
            String nameInfo = survey.next();
            System.out.println("Thank you again! Now please input your height:");
            double heightInfo = survey.nextDouble();

            if (genderInfo.equals("M")) {
                mensTotalHeight += heightInfo;
                menInSurvey++;
            }

            if (genderInfo.equals("F")) {
                womenInSurvey++;
            }
            if (heightInfo > tallestHeight) {
                tallestPerson = nameInfo;
                tallestHeight = heightInfo;
            }
            if (heightInfo < shortestHeight) {
                shortestPerson = nameInfo;
                shortestHeight = heightInfo;
            }
        }

            System.out.println("The tallest person of the group is " + tallestPerson + " standing at "
                    + String.format("%.2f", tallestHeight)+ "ft. tall.");
            System.out.println("The shortest person of the group is " + shortestPerson + " standing at "
                    + String.format("%.2f", shortestHeight) + "ft. tall.");
            System.out.println("The group average height is " + String.format("%.2f", (mensTotalHeight / menInSurvey)) + ".");
            System.out.println("A total of " + womenInSurvey + " women were surveyed.");
        }
    }
