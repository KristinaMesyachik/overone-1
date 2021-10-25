package by.overone.lesson7;

import java.util.Arrays;

public class Animal {

    private String name;
    private int countPaws;
    public static int count;

    public Animal(String name, int countPaws) {
        this.countPaws = countPaws;
        this.name = name;
        count++;
    }

    public Animal(int countPaws, String name) {
        this.countPaws = countPaws;
        this.name = name;
        count++;
    }

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public Animal(int countPaws) {
        this.countPaws = countPaws;
        count++;
    }

    public Animal() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPaws() {
        return countPaws;
    }

    public void setCountPaws(int countPaws) {
        this.countPaws = countPaws;
    }
}
