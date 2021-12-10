package by.overone.lesson13.part1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    private static Integer objectA = 3;

    public static void main(String[] args) {
        String s = "256";
        BigDecimal bigDecimal = new BigDecimal(1.5);
        BigInteger bigInteger = new BigInteger("23");
        Integer num3 = 12;
        Double num4 = 1.0;
        Float num5 = 1f;

        int primitiveA = objectA.intValue();
        Integer integer = Integer.valueOf("321");
        String integerString = integer.toString();
        Byte aByte = Byte.valueOf("12");
        Short aShort = (short) 12;
        System.out.println(aShort);
        Integer integer2 = Integer.valueOf("56");
        Byte aByte1 = Byte.valueOf("2");
        Character a = 'a';

        int b = 3;
        int result = objectA + b;

        Integer integer1 = new Integer(12);
//        Integer integer2 = integer1;
        Integer integer3 = integer1;
        Number[] array = new Number[10];
        array[0] = integer1;
        System.out.println(Arrays.toString(array));
//        Integer integer = (Integer) array[0];
        System.out.println(integer == array[1]);
    }
}
