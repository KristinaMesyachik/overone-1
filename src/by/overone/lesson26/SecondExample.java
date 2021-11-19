package by.overone.lesson26;

import java.io.*;
import java.util.Scanner;

public class SecondExample {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        byte[] buffer = scanner.nextLine().getBytes();
        OutputStream fileOutputStream = new FileOutputStream("2.txt");
        fileOutputStream.write(buffer, 0, buffer.length);
        fileOutputStream.close();

        //////////////////////////////////////////////////////////////////////////////////////////

        InputStream fileInputStream = new FileInputStream("2.txt");
        StringBuilder text = new StringBuilder();
        int symbol;
        while ((symbol = fileInputStream.read()) != -1) {
            text.append((char) symbol);
        }
        fileInputStream.close();
        System.out.println(text);

        //////////////////////////////////////////////////////////////////////////////////////////

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("2.txt"));
        StringBuilder text2 = new StringBuilder();
        int symbol2;
        while ((symbol2 = bufferedInputStream.read()) != -1) {
            text2.append((char) symbol2);
        }
        bufferedInputStream.close();
        System.out.println(text2);
    }
}
