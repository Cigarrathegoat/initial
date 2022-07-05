package objectClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(7, 30));

    }
}
