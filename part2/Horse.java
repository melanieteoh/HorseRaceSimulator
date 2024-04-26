public class Horse {
    private String name;
    private double speed;  // Basic speed factor
    private int wins;

    public Horse(String name, double speed) {
        this.name = name;
        this.speed = speed;
        this.wins = 0;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWins() {
        return wins;
    }

    public void addWin() {
        wins++;
    }
}
