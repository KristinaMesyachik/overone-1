package by.overone.lesson25;

import java.util.Arrays;
import java.util.Locale;

public class Test {
    public void dayInfo(DaysOfWeek daysOfWeek) {
        System.out.println("Today is " + daysOfWeek + " and my mood in this day : " + daysOfWeek.getMood());
    }

    public static void main(String[] args) {
        Test test = new Test();
        DaysOfWeek daysOfWeek = DaysOfWeek.MONDAY;
//        DaysOfWeek2 monday2 = DaysOfWeek2.MONDAY;
//        DaysOfWeek friday = DaysOfWeek.FRIDAY;
//        test.dayInfo(monday);
//        System.out.println(monday == friday);
//        System.out.println(monday.equals(monday2));
//        switch (daysOfWeek) {
//            case MONDAY:
//            case TUESDAY:
//            case WEDNESDAY:
//            case THURSDAY:
//            case FRIDAY:
//                System.out.println("Idi na raboty");
//                break;
//            case SUNDAY:
//            case SATURDAY:
//                System.out.println("Mozhno otdoxnyt");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
        String str = "MONDAy";
        DaysOfWeek daysOfWeek1 = DaysOfWeek.valueOf(str.toUpperCase(Locale.ROOT));
        System.out.println(daysOfWeek1);

        DaysOfWeek[] values = DaysOfWeek.values();
        System.out.println(Arrays.toString(values));

        String commandString = "go_to_main_page";
        String s = commandString.toUpperCase(Locale.ROOT);
        Commands commandEnum = Commands.valueOf(s);

        System.out.println(commandEnum.ordinal());
        System.out.println(commandEnum);
    }
}

enum DaysOfWeek {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    DaysOfWeek(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

enum DaysOfWeek2 {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    DaysOfWeek2(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

enum Commands{
    LOGIN,
    AUTHORIZATION,
    GO_TO_ADMIN_PAGE,
    GO_TO_USER_PAGE,
    GO_TO_MAIN_PAGE
}
