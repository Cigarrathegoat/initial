package menWomenHeightSurvey;

import java.util.Scanner;

public class MenWomenHeightSurvey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prompt prompt = new Prompt();
        Reader reader = new Reader();
        Calculator calculator = new Calculator();

        String gender = "";
        String name = "";
        double height = 0;

        int maleParticipants = 0;
        int femaleParticipants = 0;
        String tallestManName = "";
        double tallestManHeight = 0;
        String shortestManName = "";
        double shortestManHeight = 0;
        String tallestWomanName = "";
        double tallestWomanHeight = 0;
        String shortestWomanName = "";
        double shortestWomanHeight = 0;
        double totalMenHeight = 0;
        double totalWomenHeight = 0;
        double averageMaleHeight = 0;
        double averageFemaleHeight = 0;

        System.out.println(prompt.hello());
        int participants = reader.readInt(prompt.howMany());

        String genderVector[] = new String[participants];
        String nameVector[] = new String[participants];
        double heightVector[] = new double[participants];
        int counter = 0;

        for (int i = 0; i < participants; i++) {
            gender = reader.readString(prompt.askGender());
            name = reader.readString(prompt.askName());
            height = reader.readDouble(prompt.askHeight());

            genderVector[counter] = gender;
            nameVector[counter] = name;
            heightVector[counter] = height;
            counter++;
        }


        for (int ii = 0; ii < genderVector.length; ii++) {
            System.out.println(genderVector[ii]);

            if (genderVector[ii].equals("m")) {
                calculator.heightAdder(totalMenHeight, heightVector[ii]);
                calculator.participantAdder(maleParticipants);
                averageMaleHeight = calculator.averager(totalMenHeight, maleParticipants);
                if (tallestManHeight < heightVector[ii]) {
                    calculator.stringReplacer(tallestManName, nameVector[ii]);
                    calculator.doubleReplacer(tallestManHeight, heightVector[ii]);
                }
                else if (shortestManHeight > heightVector[ii]) {
                    calculator.stringReplacer(shortestManName, nameVector[ii]);
                    calculator.doubleReplacer(shortestManHeight, heightVector[ii]);
                }
            }
            else {
                calculator.heightAdder(totalWomenHeight, heightVector[ii]);
                calculator.participantAdder(femaleParticipants);
                averageFemaleHeight = calculator.averager(totalWomenHeight, femaleParticipants);
                if (tallestWomanHeight < heightVector[ii]) {
                    calculator.stringReplacer(tallestWomanName, nameVector[ii]);
                    calculator.doubleReplacer(tallestWomanHeight, heightVector[ii]);
                }
                else if (shortestWomanHeight > heightVector[ii]) {
                    calculator.stringReplacer(shortestWomanName, nameVector[ii]);
                    calculator.doubleReplacer(shortestWomanHeight, heightVector[ii]);
                }
            }

        }

        System.out.println(prompt.allMenSurveyedPrompt());
        System.out.println(maleParticipants);
        System.out.println("\n");
        System.out.println(prompt.allWomenSurveyedPrompt());
        System.out.println(femaleParticipants);
        System.out.println("\n");

        System.out.println(prompt.tallestManPrompt());
        System.out.println(tallestManName);
        System.out.println(prompt.tallestManHeightPrompt());
        System.out.println(tallestManHeight);
        System.out.println("\n");

        System.out.println(prompt.tallestWomanPrompt());
        System.out.println(tallestWomanName);
        System.out.println(prompt.tallestWomanHeightPrompt());
        System.out.println(tallestWomanHeight);
        System.out.println("\n");

        System.out.println(prompt.shortestManPrompt());
        System.out.println(shortestManName);
        System.out.println(prompt.shortestManHeightPrompt());
        System.out.println(shortestManHeight);
        System.out.println("\n");

        System.out.println(prompt.shortestWomanPrompt());
        System.out.println(shortestWomanName);
        System.out.println(prompt.tallestWomanHeightPrompt());
        System.out.println(shortestWomanHeight);
        System.out.println("\n");

        System.out.println(prompt.averageMenHeight());
        System.out.println(averageMaleHeight);
        System.out.println(prompt.averageWomenHeight());
        System.out.println(averageFemaleHeight);




   }
}*/