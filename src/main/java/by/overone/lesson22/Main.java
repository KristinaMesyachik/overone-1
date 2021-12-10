package by.overone.lesson22;

public class Main<T extends Number> {
    public static void main(String[] args) {
        Main<Integer> integerMain = new Main<>();
    }

    public <K extends Integer> void foo(Main<K> num) {

    }
}
