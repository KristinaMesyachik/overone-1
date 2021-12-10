package by.overone.lesson8;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        time.setSeconds(1);
        time.setMin(1);
        time.setHours(0);
        int timeInSeconds = time.getTimeInSeconds();
        System.out.println(timeInSeconds);
    }
}
