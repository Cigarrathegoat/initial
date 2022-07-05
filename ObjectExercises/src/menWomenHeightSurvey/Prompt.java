package menWomenHeightSurvey;

public class Prompt {

    public String howMany(){
        return "Firstly, how many people will be participating in this survey?";
    }
    public String hello() {
        return "Hello, welcome to the height survey! Now please answer the following questions!";
    }
    public String askGender() {
        return "What is your gender? Please input \"m\" for male and \"f\" for female:";
    }
    public String askName() {
        return "Awesome!  Now please input your name:";
    }
    public String askHeight() {
        return "Great! Now please inform your height:";
    }
    public String shortestManPrompt() {
        return "The shortest man surveyed today is ";
    }
    public String shortestManHeightPrompt() {
        return ", with a height of ";
    }
    public String tallestManPrompt() {
        return "The tallest man surveyed today is ";
    }
    public String tallestManHeightPrompt() {
        return ", with a height of ";
    }
    public String shortestWomanPrompt() {
        return "The shortest woman surveyed today is ";
    }
    public String shortestWomanHeightPrompt() {
        return ", with a height of ";
    }
    public String tallestWomanPrompt() {
        return "The tallest woman surveyed today is ";
    }
    public String tallestWomanHeightPrompt() {
        return ", with a height of ";
    }
    public String allMenSurveyedPrompt() {
        return "The total number of men surveyed today was: ";
    }
    public String allWomenSurveyedPrompt() {
        return "The total number of women surveyed today was: ";
    }
    public String averageMenHeight() {
        return "The average height of all men surveyed today was: ";
    }
    public String averageWomenHeight() {
        return "The average height of all women surveyed today was: ";
    }

}

