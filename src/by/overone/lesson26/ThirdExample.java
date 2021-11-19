package by.overone.lesson26;

import java.io.*;
import java.util.Scanner;

public class ThirdExample {
    public static void main(String... args) throws IOException {
        File file = new File("1.txt");
        PrintStream filePrintStream = new PrintStream(file);
        filePrintStream.println(1);
        filePrintStream.println("Hello world");
        filePrintStream.println(false);

        //////////////////////////////////////////////////////////////////////////////////////////

        String text = "Hello world";
        byte[] textBytes = text.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(textBytes);
        System.setIn(byteArrayInputStream);
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        //////////////////////////////////////////////////////////////////////////////////////////

        FileWriter writer = new FileWriter("1.txt", true);
        String text1 = "Hello World!";
        writer.write(text1);
        writer.close();
        FileReader fileReader = new FileReader("1.txt");
        StringBuilder text2 = new StringBuilder();
        int symbol;
        while ((symbol = fileReader.read()) != -1) {
            text2.append((char) symbol);
        }
        System.out.println(text2);

        //////////////////////////////////////////////////////////////////////////////////////////

        FileWriter fileWriter = new FileWriter("1.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Text\n");
        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder text3 = new StringBuilder();
        for (String line = ""; line != null; line = bufferedReader.readLine()) {
            text3.append(line).append("\n");
        }
        System.out.println(text3);
    }
}
