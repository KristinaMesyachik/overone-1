package robots;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Dump {
    private static final Map<RobotDetails, Integer> dumpDetails = new HashMap<>();
    private static final Map<Integer, RobotDetails> mapToGet_Dump = new HashMap<>();
    private boolean available = false;
    private static final Random random = new Random();

    public Dump() {
        dumpDetails.put(RobotDetails.HEAD, 0);
        dumpDetails.put(RobotDetails.BODY, 0);
        dumpDetails.put(RobotDetails.LEFT_HAND, 0);
        dumpDetails.put(RobotDetails.RIGHT_HAND, 0);
        dumpDetails.put(RobotDetails.LEFT_LEG, 0);
        dumpDetails.put(RobotDetails.RIGHT_LEG, 0);
        dumpDetails.put(RobotDetails.CPU, 0);
        dumpDetails.put(RobotDetails.RAM, 0);
        dumpDetails.put(RobotDetails.HDD, 0);

        mapToGet_Dump.put(1, RobotDetails.HEAD);
        mapToGet_Dump.put(2, RobotDetails.BODY);
        mapToGet_Dump.put(3, RobotDetails.LEFT_HAND);
        mapToGet_Dump.put(4, RobotDetails.RIGHT_HAND);
        mapToGet_Dump.put(5, RobotDetails.LEFT_LEG);
        mapToGet_Dump.put(6, RobotDetails.RIGHT_LEG);
        mapToGet_Dump.put(7, RobotDetails.CPU);
        mapToGet_Dump.put(8, RobotDetails.RAM);
        mapToGet_Dump.put(9, RobotDetails.HDD);
    }


    public synchronized void getDumpDetails(int nightNumber, Scientist scientist) {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        nightNumber++;
        int servantGetDetails = random.nextInt(4) + 1;
        System.out.println("[Servant get [" + servantGetDetails + "] details night number " + nightNumber + " ]");

        for (int i = 0; i < servantGetDetails; i++) {
            int key = random.nextInt(9) + 1;
            if (dumpDetails.get(mapToGet_Dump.get(key)) != 0) {
                scientist.addScientistDetails(mapToGet_Dump.get(key));
            } else i--;

        }

        available = false;
        notifyAll();
    }

    public synchronized void putDumpDetails(Map<Integer, RobotDetails> map_Factory, int nightNumber) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        int rand = random.nextInt(4) + 1;

        if (nightNumber == 1) {
            System.out.println("[Factory throw [20] details,night number " + nightNumber + " ]");
            for (int i = 0; i < 20; i++) {
                dumpDetails.put(map_Factory.get(random.nextInt(9) + 1), dumpDetails.get(map_Factory.get(random.nextInt(9) + 1)) + 1);
            }
        } else {
            System.out.println("[Factory throw [" + rand + "] details,night number " + nightNumber + " ]");
            for (int i = 0; i < rand; i++) {
                dumpDetails.put(map_Factory.get(random.nextInt(9) + 1), dumpDetails.get(map_Factory.get(random.nextInt(9) + 1)) + 1);
            }
        }
        available = true;
        notifyAll();
    }

    public Map<RobotDetails, Integer> getMap_Dump() {
        return dumpDetails;
    }
}
