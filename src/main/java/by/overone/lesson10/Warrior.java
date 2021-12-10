package by.overone.lesson10;

public class Warrior extends Hero {

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println(getName() + " " + " warrior attacks enemies");
    }
}
