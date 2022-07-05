package menWomenHeightSurvey.controller;

public class Calculator {

    public double heightAdder(double valueEins, double valueZwei) {
        return valueEins += valueZwei;
    }

    public int participantAdder(int valueUno) {
        return valueUno++;
    }

    public double averager(double valueUm, int valueDois) {
        return valueUm / valueDois;
    }
}
