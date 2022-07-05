package ageInDays;
import java.util.Scanner;

/**
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
 * dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */

/*steps
1. Ask user's birthday
2. Ask user's birth month
3. Ask user's birth year
4. establish variable for year difference
5. establish variable for day difference
6. establish switch statement for all months of the year
7. equate given month to thirty days
8. make final formula for person's age in days.
 */

public class AgeInDays {

    public static void main(String[] arg) {

        Scanner dateInput = new Scanner(System.in);

        System.out.println("Please input, in number form, the year you were born:");
        int yearBorn = dateInput.nextInt();
        System.out.println("Please input, in number form, the month you were born:");
        int monthBorn = dateInput.nextInt();
        System.out.println("Please input, in number form, only the day you were born:");
        int dayBorn = dateInput.nextInt();

        int currentYear = 2022;
        int currentMonth = 06;
        int currentDay = 12;

        int yearDifferenceInDays = (currentYear - yearBorn) * 365;
        int monthDifferenceInDays = (currentMonth - monthBorn) * 30;
        int dayDifference = (currentDay - dayBorn);

        int daysAlive = (yearDifferenceInDays + monthDifferenceInDays + dayDifference);

        System.out.println("You have been alive for: " + daysAlive + " days!");



    }




}
