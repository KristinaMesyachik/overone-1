package by.overone.lesson11;

public class Cat implements Animal {

    @Override
    public void say() {
        System.out.println("I am cat");
    }

    @Override
    public void go() {
        System.out.println("Cat go ... go ...");
    }
}
