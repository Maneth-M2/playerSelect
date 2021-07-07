public class Player {
    private String playerName;
    private int playerAge;
    private String playerType;
    private double playerStatistics;

    public Player(String playerName, int playerAge, String playerType, double playerStatistics) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerType = playerType;
        this.playerStatistics = playerStatistics;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }
    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }
    public String getPlayerType() {
        return playerType;
    }
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }
    public double getPlayerStatistics() {
        return playerStatistics;
    }
    public void setPlayerStatistics(double playerStatistics) {
        this.playerStatistics = playerStatistics;
    }
    public double statAverage(){
        double average = playerStatistics/15;
        return average;
    }
}
