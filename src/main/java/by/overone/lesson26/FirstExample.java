package by.overone.lesson26;

import java.io.*;

public class FirstExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("1.txt");
        int symbol;
        while ((symbol = inputStream.read()) != -1) {
            System.out.print((char) symbol);
        }


        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        while ((symbol = inputStreamReader.read()) != -1) {
            System.out.print((char) symbol);
        }

        //////////////////////////////////////////////////////////////////////////////////////////

        FileInputStream fileInputStream = new FileInputStream("1.txt");
        System.out.printf("File size: %d bytes \n", fileInputStream.available());
        int i;
        StringBuilder result = new StringBuilder();
        while ((i = fileInputStream.read()) != -1) {
            result.append((char) i);
        }
        fileInputStream.close();
        System.out.println(result);

        //////////////////////////////////////////////////////////////////////////////////////////

        InputStream inputStream2 = new FileInputStream("1.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream2);
        int symbol2;
        StringBuilder text = new StringBuilder();
        while ((symbol2 = bufferedInputStream.read()) != -1) {
            text.append((char) symbol2);
        }
        System.out.println(text);

        //////////////////////////////////////////////////////////////////////////////////////////

        Reader reader = new FileReader("1.txt");
        BufferedReader br = new BufferedReader(reader);
        StringBuilder text2 = new StringBuilder();
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            text2.append(line).append("\n");
        }
        System.out.println(text2);
    }
}
