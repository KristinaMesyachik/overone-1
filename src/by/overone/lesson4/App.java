package by.overone.lesson4;

public class App {
    public static void main(String[] args) {
        String str = "Friday";
//        if (str.equals("Monday")) {
//            System.out.println("Monday");
//        } else if (str.equals("Tuesday")) {
//            System.out.println("Tuesday");
//        } else if (str.equals("Wednesday")) {
//            System.out.println("Wednesday");
//        } else if (str.equals("Thursday")) {
//            System.out.println("Thursday");
//        }
        switch (str) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Friday");
        }
        int[][][] array = new int[1][2][3];
        System.out.println(array.length * array[0].length * array[0][0].length);
        for (int b = 0; b < array.length; b++) {
            for (int x = 0; x < array[0].length; x++) {
                System.out.println(array[b][x]);
            }
        }
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
