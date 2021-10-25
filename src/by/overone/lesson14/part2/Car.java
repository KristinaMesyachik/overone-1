package by.overone.lesson14.part2;

import by.overone.lesson14.part1.Cat;

public class Car {
    private String model;
    private Cat cat;
    public static Integer count;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
