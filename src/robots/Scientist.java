package robots;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Scientist extends Thread {
    private final Dump dump;
    private final Map<RobotDetails, Integer> scientistDetails = new HashMap<>();

    public Scientist(Dump dump) {
        scientistDetails.put(RobotDetails.HEAD, 0);
        scientistDetails.put(RobotDetails.BODY, 0);
        scientistDetails.put(RobotDetails.LEFT_HAND, 0);
        scientistDetails.put(RobotDetails.RIGHT_HAND, 0);
        scientistDetails.put(RobotDetails.LEFT_LEG, 0);
        scientistDetails.put(RobotDetails.RIGHT_LEG, 0);
        scientistDetails.put(RobotDetails.CPU, 0);
        scientistDetails.put(RobotDetails.RAM, 0);
        scientistDetails.put(RobotDetails.HDD, 0);
        this.dump = dump;
    }

    public Map<RobotDetails, Integer> getScientistDetails() {
        return scientistDetails;
    }

    public void addScientistDetails(RobotDetails detail) {
        scientistDetails.put(detail, scientistDetails.get(detail) + 1);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            dump.getDumpDetails(i, this);
        }
        System.out.println("Scientist details: " + getScientistDetails() + "\n" + "The number of robots that he was able to collect: " + countOfRobots());
    }

    private int countOfRobots() {
        return scientistDetails.values().stream()
                .mapToInt(i -> i)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

}
