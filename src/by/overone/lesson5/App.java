package by.overone.lesson5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number");
            scanner.nextLine();
        }
        int num = scanner.nextInt();
        long sum = 0L;
        for (int i = 1; i <= 100; i++) {
            sum += i*i;
        }
        System.out.println(sum);
    }
}
