package by.overone.lesson27;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    private transient String name;
    private Dog dog;

    public Person(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dog);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}

class Dog implements Serializable {
    private String name;
    private Double countOfPaws;

    public Dog(String name, Double countOfPaws) {
        this.name = name;
        this.countOfPaws = countOfPaws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCountOfPaws() {
        return countOfPaws;
    }

    public void setCountOfPaws(Double countOfPaws) {
        this.countOfPaws = countOfPaws;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(countOfPaws, dog.countOfPaws);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countOfPaws);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", countOfPaws=" + countOfPaws +
                '}';
    }
}
