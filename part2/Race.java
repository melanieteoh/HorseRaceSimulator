import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Horse> horses;
    private int trackLength;

    public Race(List<Horse> horses, int trackLength) {
        this.horses = new ArrayList<>(horses);
        this.trackLength = trackLength;
    }

    public List<Horse> startRace() {
        Horse winner = null;
        double maxDistance = 0;
        for (Horse horse : horses) {
            double distance = horse.getSpeed() * Math.random() * trackLength;
            if (distance > maxDistance) {
                maxDistance = distance;
                winner = horse;
            }
        }
        if (winner != null) {
            winner.addWin();
        }
        return horses;  // Return the list of horses for result display
    }
}
