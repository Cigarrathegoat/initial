package ChangeCalculator;
import java.util.Scanner;

/**
 * Escreva um sistema que a partir da quantidade de produtos comprados,
 * valor da unidade do produto e o valor pago,
 * escreva na tela qual o troco que tem que ser devolvido ao cliente.
 */
public class ChangeCalculator {
    /*
    read total products purchased
    read product cost
    add products purchased and product cost
    read amount paid
    subtract total cost from amount paid
    display change
     */

    public static void main(String[] args) {

        Scanner inventoryReader = new Scanner(System.in);
        System.out.println("Please input total products purchased:");
        int totalProducts = inventoryReader.nextInt();
        System.out.println("Please input product cost");
        double productCost = inventoryReader.nextDouble();
        System.out.println("Please input amount paid:");
        double amountPaid = inventoryReader.nextDouble();
        double totalCost = (totalProducts * productCost);
        double change = amountPaid - totalCost;
        if (amountPaid > totalCost) {
            System.out.println("Your change owed is: $"+change+".");
        }
        else if (amountPaid == totalCost) {
            System.out.println("You've paid the exact amount!");
        }
        else {
            System.out.println("You're still short $"+(change * -1));

        }

    }
}
