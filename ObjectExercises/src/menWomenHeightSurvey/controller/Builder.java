package menWomenHeightSurvey.controller;

import menWomenHeightSurvey.model.Result;

public class Builder {
    public void buildVectors(int participants, Reader reader, Prompt prompt,
                             String genderVector[], String nameVector[],
                             double heightVector[]){
        String gender = "";
        String name = "";
        double height = 0;


        for (int i = 0; i < participants; i++) {
            gender = reader.readString(prompt.askGender());
            name = reader.readString(prompt.askName());
            height = reader.readDouble(prompt.askHeight());

            genderVector[i] = gender;
            nameVector[i] = name;
            heightVector[i] = height;
        }
    }


    public Result maleInformationsBuilder(Result maleResult, double actualVectorHeight,
                                        String actualVectorName, Calculator calculator){

        maleResult.setTotalHeight(calculator.heightAdder(maleResult.getTotalHeight(), actualVectorHeight));
        maleResult.setParticipants(calculator.participantAdder(maleResult.getParticipants()));
        maleResult.setAverageHeight(calculator.averager(maleResult.getTotalHeight(), maleResult.getParticipants()));

        if (maleResult.getTallestHeight() < actualVectorHeight) {
            maleResult.setTallestName(actualVectorName);
            maleResult.setTallestHeight(actualVectorHeight);
        }
        if (maleResult.getShortestHeight() > actualVectorHeight) {
            maleResult.setShortestName(actualVectorName);
            maleResult.setShortestHeight(actualVectorHeight);
        }

        return maleResult;
    }
}
