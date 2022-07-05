package menWomenHeightSurvey.view;

import menWomenHeightSurvey.controller.*;
import menWomenHeightSurvey.model.Result;

import java.util.Scanner;

public class MenWomenHeightSurvey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prompt prompt = new Prompt();
        Reader reader = new Reader();
        Replacer replacer = new Replacer();
        Calculator calculator = new Calculator();
        Builder builder = new Builder();


        Result maleResult = new Result();
        int femaleParticipants = 0;
        String tallestWomanName = "";
        double tallestWomanHeight = 0;
        String shortestWomanName = "";
        double shortestWomanHeight = 0;
        double totalWomenHeight = 0;
        double averageFemaleHeight = 0;

        System.out.println(prompt.hello());
        int participants = reader.readInt(prompt.howMany());

        String genderVector[] = new String[participants];
        String nameVector[] = new String[participants];
        double heightVector[] = new double[participants];

        builder.buildVectors(participants, reader, prompt, genderVector, nameVector, heightVector);

        for (int i = 0; i < genderVector.length; i++) {
            System.out.println(genderVector[i]);

            if (genderVector[i].equals("m")) {
                maleResult = builder.maleInformationsBuilder(maleResult, heightVector[i], nameVector[i], calculator);
            } else {
                calculator.heightAdder(totalWomenHeight, heightVector[i]);
                calculator.participantAdder(femaleParticipants);
                averageFemaleHeight = calculator.averager(totalWomenHeight, femaleParticipants);
                if (tallestWomanHeight < heightVector[i]) {
                    replacer.replacerName(tallestWomanName, nameVector[i]);
                    replacer.replacerHeight(tallestWomanHeight, heightVector[i]);
                } else if (shortestWomanHeight > heightVector[i]) {
                    replacer.replacerName(shortestWomanName, nameVector[i]);
                    replacer.replacerHeight(shortestWomanHeight, heightVector[i]);
                }
            }

        }

        System.out.println(prompt.allMenSurveyedPrompt());
        System.out.println(maleResult.getParticipants());
        System.out.println();
        System.out.println(prompt.allWomenSurveyedPrompt());
        System.out.println(femaleParticipants);
        System.out.println();

        System.out.println(prompt.tallestManPrompt());
        System.out.println(maleResult.getTallestName());
        System.out.println(prompt.tallestManHeightPrompt());
        System.out.println(maleResult.getTallestHeight());
        System.out.println("\n");

        System.out.println(prompt.tallestWomanPrompt());
        System.out.println(tallestWomanName);
        System.out.println(prompt.tallestWomanHeightPrompt());
        System.out.println(tallestWomanHeight);
        System.out.println("\n");

        System.out.println(prompt.shortestManPrompt());
        System.out.println(maleResult.getShortestName());
        System.out.println(prompt.shortestManHeightPrompt());
        System.out.println(maleResult.getShortestHeight());
        System.out.println("\n");

        System.out.println(prompt.shortestWomanPrompt());
        System.out.println(shortestWomanName);
        System.out.println(prompt.tallestWomanHeightPrompt());
        System.out.println(shortestWomanHeight);
        System.out.println("\n");

        System.out.println(prompt.averageMenHeight());
        System.out.println(maleResult.getAverageHeight());
        System.out.println(prompt.averageWomenHeight());
        System.out.println(averageFemaleHeight);


    }
}