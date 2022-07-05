package loopExample;

import java.util.Scanner;

/**
 * Escreva um programa que leia o nome e a idade de 10 pessoas e diga qual a mais velha e a mais nova
 * 1. repeat ten times
 * 2. gather all names and ages
 *
 *
 */
public class ForExample {
    public static void main(String[] args) {
        Scanner infoReader = new Scanner(System.in);

        String oldestName = "";
        int oldestAge = 0;
        String youngestName = "";
        int youngestAge = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println("Please input your name");
            String name = infoReader.next();
            System.out.println("Please input your age");
            int age = infoReader.nextInt();
            if (age > oldestAge) {
                oldestName = name;
                oldestAge = age;
            }
            if (age < youngestAge) {
                youngestName = name;
                youngestAge = age;
            }
        }
        System.out.println("The oldest person surveyed is " + oldestName
                + ", with " + oldestAge + " years of age.");
        System.out.println("the youngest person surveyed is " + youngestName
                + ", with " + youngestAge + " years of age.");
    }
}
