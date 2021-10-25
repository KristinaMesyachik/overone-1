package by.overone.lesson10;

public class Animal {

    private String name;
    private int countPaws;

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

    public void say() {
        System.out.println("Hi");
    }
}
