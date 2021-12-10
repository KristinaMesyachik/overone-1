package by.overone.lesson1;

import by.overone.lesson16.Main;

/**
 * App
 *
 * @author Ivan Ivanov
 */
public class App {

    static byte num;
    static short num1;
    static int num2;
    static long num3;

    static float num4;
    static double num5;

    static boolean num6;
    static char num7;

    public static void main(String[] args) {
        // однострочный комментарий

        /**/
        /* много-
         * строчный комментарий*/

        /**
         * документированный комментарий
         * */

        byte b = 2;
        short s = 3;
        int num = 2;
        double num1 = 2.3;
        char ch = '2';
        boolean flag = true;
        System.out.println(num + " " + num1 + " " + ch + " " + flag + "" + b + "" + s);

    }
}
