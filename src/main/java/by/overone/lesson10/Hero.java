package by.overone.lesson10;

public class Hero {
    private String name;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println(name + " " + "attacks enemies");
    }
}
