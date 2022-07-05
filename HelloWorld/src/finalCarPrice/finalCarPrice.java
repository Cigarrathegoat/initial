package finalCarPrice;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
 * e dos impostos (aplicados ao custo de fábrica).
 * Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
 * escrever um algoritmo para ler o custo de fábrica de um carro,
 * calcular e escrever o custo final ao consumidor.
 *
 * 1. gather car cost;
 * 2. gather manufacturer fee;
 * 3. gather tax;
 * 4. sum it all up
 */

public class finalCarPrice {

    public static void main(String[] args) {
        Scanner priceTaker = new Scanner(System.in);
        System.out.println("Please input the cost of the car:");
        double carPrice = priceTaker.nextDouble();

        double makerTax = carPrice * 0.28;
        double stateTax = carPrice * 0.45;
        double finalPrice = carPrice + makerTax + stateTax;

        System.out.println("The final price of the car is $" + new DecimalFormat(".##").format(finalPrice) + ".");


    }



}
