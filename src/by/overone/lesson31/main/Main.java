package by.overone.lesson31.main;

import by.overone.lesson31.controller.BookController;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.mainMenu();
        sc.close();
    }
}
