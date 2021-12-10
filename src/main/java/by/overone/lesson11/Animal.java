package by.overone.lesson11;

public interface Animal extends BigAnimal {

    void say();

    default void eat() {
        System.out.println("All animal has default method eat");
    }
}
