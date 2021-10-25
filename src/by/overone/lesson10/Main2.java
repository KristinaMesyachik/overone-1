package by.overone.lesson10;

public class Main2 {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero");
        Enemy enemy = new Enemy(100);
        hero.attackEnemy(enemy);
    }
}
