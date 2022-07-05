package helloWorld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int nome = sc.nextInt(8);
        System.out.println("Hello " + nome);
    }
}

