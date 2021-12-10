package by.overone.lesson8;

public class Time {

    private int seconds;
    private int min;
    private int hours;

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getMin() {
        return this.min;
    }

    public int getHours() {
        return this.hours;
    }

    public int getTimeInSeconds() {
        return transferHoursToSeconds(this.hours) + transferMinToSeconds(this.min) + this.seconds;
    }

    private int transferHoursToSeconds(int hours) {
        return hours * 3600;
    }

    private int transferMinToSeconds(int min) {
        return min * 60;
    }

}
