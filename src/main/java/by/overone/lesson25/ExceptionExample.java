package by.overone.lesson25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args) {
        Test test = null;
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[6]);
            test.dayInfo(DaysOfWeek.MONDAY);
            System.out.println("Hello");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBounds exception...");
        } catch (NullPointerException exception) {
            System.out.println("Null pointer exception...");
        } catch (Exception exception) {
            System.err.println("Something went wrong");
        } finally {
            System.out.println("finally block");
        }
        FileInputStream fileInputStream = null;
        int num;
        try {
            num = 10;
            fileInputStream = new FileInputStream("C://documents//a.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            throw new MyCustomException(fileNotFoundException);
//            System.err.println("File not found ...");
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.err.println("Thread haven't close");
                }
            }
        }
    }
}
