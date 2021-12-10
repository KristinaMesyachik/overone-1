package robots;

import java.util.HashMap;
import java.util.Map;

public class Factory extends Thread {
    private final Dump dump;
    public Map<Integer, RobotDetails> factoryDetails = new HashMap<>();

    public Factory(Dump dump) {
        factoryDetails.put(1, RobotDetails.HEAD);
        factoryDetails.put(2, RobotDetails.BODY);
        factoryDetails.put(3, RobotDetails.LEFT_HAND);
        factoryDetails.put(4, RobotDetails.RIGHT_HAND);
        factoryDetails.put(5, RobotDetails.LEFT_LEG);
        factoryDetails.put(6, RobotDetails.RIGHT_LEG);
        factoryDetails.put(7, RobotDetails.CPU);
        factoryDetails.put(8, RobotDetails.RAM);
        factoryDetails.put(9, RobotDetails.HDD);
        this.dump = dump;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            putDetails(i, dump);
        }
    }

    public void putDetails(int numberOfNight, Dump dump) {
        numberOfNight++;
        dump.putDumpDetails(factoryDetails, numberOfNight);
        try {
            Thread.sleep(150);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}