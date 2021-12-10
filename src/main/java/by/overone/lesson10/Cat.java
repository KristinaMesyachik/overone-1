package by.overone.lesson10;

public class Cat extends Animal {

    private String nickname;

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public Cat() {
        System.out.println("");
    }

    @Override
    public void say() {
        System.out.println("Мяу мяу");
    }

}
