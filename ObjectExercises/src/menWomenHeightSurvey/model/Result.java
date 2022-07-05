package menWomenHeightSurvey.model;

public class Result {
    private double totalHeight;
    private double averageHeight;
    private double tallestHeight;
    private double shortestHeight;
    private int participants;
    private String tallestName;
    private String shortestName;


    public Result(){
        shortestHeight = 100;
    }

    public Result(double totalHeight, double averageHeight, double tallestHeight,
                  double shortestHeight, String tallestName, String shortestName,
                  int participants){
        setTotalHeight(totalHeight);
        setAverageHeight(averageHeight);
        setTallestHeight(tallestHeight);
        setShortestHeight(shortestHeight);
        setTallestName(tallestName);
        setShortestName(shortestName);
        setParticipants(participants);
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public double getTotalHeight() {
        return totalHeight;
    }

    public void setTotalHeight(double totalHeight) {
        this.totalHeight = totalHeight;
    }

    public double getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(double averageHeight) {
        this.averageHeight = averageHeight;
    }

    public double getTallestHeight() {
        return tallestHeight;
    }

    public void setTallestHeight(double tallestHeight) {
        this.tallestHeight = tallestHeight;
    }

    public double getShortestHeight() {
        return shortestHeight;
    }

    public void setShortestHeight(double shortestHeight) {
        this.shortestHeight = shortestHeight;
    }

    public String getTallestName() {
        return tallestName;
    }

    public void setTallestName(String tallestName) {
        this.tallestName = tallestName;
    }

    public String getShortestName() {
        return shortestName;
    }

    public void setShortestName(String shortestName) {
        this.shortestName = shortestName;
    }
}
