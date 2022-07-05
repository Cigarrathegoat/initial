package salaryAverage;

import java.util.Scanner;

public class SalaryAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Prompts prompts = new Prompts();
        Reader reader = new Reader();
        AverageFinder averageFinder = new AverageFinder();

        double allSalaries = 0;
        double averageOfSalaries = 0;

        int headCount = reader.readInt(prompts.askHeadCount());

        for(int i = 0; i < headCount; i++) {
            String employeeName = reader.readString(prompts.askName());
            double employeeSalary = reader.readDouble(prompts.askSalary());
            allSalaries += employeeSalary;
        }
        averageOfSalaries = averageFinder.average(allSalaries, headCount);

        System.out.println(prompts.giveAverage());
        System.out.println(averageOfSalaries);

    }
}
