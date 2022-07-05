package loopExample;

import java.util.Scanner;

/**
 *Descubra, de 12 produtos entre 3 categorias,
 * quais foram os mais vendidos de cada categoria,
 * baseado no estoque inicial e atual de cada produto.
 * 1. establish variables for best sold, price and percentage sold for each segment
 * 2. get info on segment, starting inventory, current inventory and price of each product
 * 3. print out results found
 */
public class BestSoldProducts {

    public static void main(String[] args) {

        String sportsChamp = "";
        int sportsChampUnits = 0;
        double sportsChampRevenue = 0;
        String electronicsChamp = "";
        int electronicsChampUnits = 0;
        double electronicsChampRevenue = 0;
        String clothesChamp = "";
        int clothesChampUnits = 0;
        double clothesChampRevenue = 0;

        Scanner inventory = new Scanner (System.in);

        for (int i = 0; i < 12; i++) {
            System.out.println("Please input product name:");
            String productName = inventory.next();
            System.out.println("Please input product segment (sports, electronics or clothing):");
            String segment = inventory.next();
            System.out.println("Please input product price:");
            double productPrice = inventory.nextInt();
            System.out.println("Please input initial stock:");
            int initialStock = inventory.nextInt();
            System.out.println("please input current stock:");
            int currentStock = inventory.nextInt();
            int volumeSold = initialStock - currentStock;

            switch (segment) {
                case "sports":
                    if (volumeSold > sportsChampUnits) {
                        sportsChampUnits = volumeSold;
                        sportsChamp = productName;
                        sportsChampRevenue = productPrice * volumeSold;

                    };
                    break;
                case "electronics":
                    if (volumeSold > electronicsChampUnits) {
                        electronicsChampUnits = volumeSold;
                        electronicsChamp = productName;
                        electronicsChampRevenue = productPrice * volumeSold;

                    };
                    break;
                case "clothing":
                    if (volumeSold > clothesChampUnits) {
                        clothesChampUnits = volumeSold;
                        clothesChamp = productName;
                        clothesChampRevenue = productPrice * volumeSold;

                    };
            }

        }
        System.out.println("The highest-sold clothing item is the " + clothesChamp + ", having sold "
        + clothesChampUnits + " units and earned $" + clothesChampRevenue + " in revenue.");
        System.out.println("The highest-sold electronics item is the " + electronicsChamp + ", having sold "
                + electronicsChampUnits + " units and earned $" + electronicsChampRevenue + " in revenue.");
        System.out.println("The highest-sold sporting goods item is the " + sportsChamp + ", having sold "
                + sportsChampUnits + " units and earned $" + sportsChampRevenue + " in revenue.");


    }
}
