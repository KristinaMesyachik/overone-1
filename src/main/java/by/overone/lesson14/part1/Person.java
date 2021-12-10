package by.overone.lesson14.part1;

import java.util.Objects;

public class Person implements Cloneable {

    private String name;
    private int age;
    private double id;
    private Cat cat;

    public Person(String name, int age, double id, Cat cat) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public String toString() {
        return "Person{" + "name" + name + ",age" + age + ",id" + id + ",cat" + cat + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.id, id) == 0 && Objects.equals(name, person.name) && Objects.equals(cat, person.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id, cat);
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.cat = this.cat.clone();
        return person;
    }
}
