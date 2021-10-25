package by.overone.lesson11;

public class B extends A {

    private String name;
    private int count;

    public B() {
        super();
        System.out.println("B");
    }

    public B(String name, int count) {
        System.out.println("B");
        this.name = name;
        this.count = count;
    }
}
