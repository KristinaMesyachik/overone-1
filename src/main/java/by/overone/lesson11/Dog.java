package by.overone.lesson11;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("I am dog");
    }

    @Override
    public void go() {
        System.out.println("Go ... go ...");
    }
}


