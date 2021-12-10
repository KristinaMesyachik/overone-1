package by.overone.lesson3;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
//        if (a() ^ b() ^ c()) {
//            System.out.println("True");
//        }
//        System.out.println(b++ + --b);

        if (a > b && b < 1 || b == 3) {
            if (a != b) {
                System.out.println("a!=b");
            }
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }

    }

    public static boolean a() {
        System.out.println("A");
        return true;
    }

    public static boolean b() {
        System.out.println("B");
        return true;
    }

    public static boolean c() {
        System.out.println("C");
        return true;
    }
}
