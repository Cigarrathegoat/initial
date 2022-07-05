package salaryAverage;

import java.util.Scanner;

public class Reader {

    private Scanner sc = new Scanner(System.in);

    public int readInt(String text) {
        System.out.println(text);
        return sc.nextInt();
    }
    public double readDouble(String text3) {
        System.out.println(text3);
        return sc.nextDouble();
    }
    public String readString(String text2) {
        System.out.println(text2);
        return sc.next();
    }
}
