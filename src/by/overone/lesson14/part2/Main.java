package by.overone.lesson14.part2;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int result = a + b;
        Car car = new Car("BMW");
        Integer num = 109;
        Integer num2 = 109;
        System.out.println(num == num2);
        print(car);
        int newResult = result + 10;
        view(car);
        String str = "Tesla";
        String str2 = "Tesla";
        String str3 = "Tesla";
        System.out.println(str == str2);
        System.out.println(str2 == str3);
        System.out.println(str == str3);
    }

    public static void print(Car car) {
        view(car);
    }

    public static void view(Car car) {
        print(car);
    }
}
