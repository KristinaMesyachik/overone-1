package by.overone.lesson19;

public class Main {
    public static void main(String[] args) throws Exception {
        Math<Short> number = new Math<>(new Short((short) 2), new Short((short) 10));

        Number sum = MathUtil.sum(number);

        Number multiply = MathUtil.multiply(number);

        System.out.println(sum);
        System.out.println(multiply);

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
