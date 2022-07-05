package menWomenHeightSurvey;

import java.util.Scanner;

public class Reader {

    private Scanner sc = new Scanner(System.in);

    public String readString(String text1) {
        System.out.println(text1);
        return sc.next();
    }
    public double readDouble(String text2) {
        System.out.println(text2);
        return sc.nextDouble();
    }
    public int readInt(String text3) {
        System.out.println(text3);
        return sc.nextInt();
    }
}
