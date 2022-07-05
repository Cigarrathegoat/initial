import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner screenReader = new Scanner(System.in);
//right-click > refactor > rename selects all instances of a word and changes them all
        System.out.println("What is your name?");
        String name = screenReader.nextLine();
        System.out.println("How old are you?");
        int age = screenReader.nextInt();
        screenReader.nextLine();
        System.out.println("what is your favorite food?");
        String food = screenReader.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("You like "+food);
    }
}

