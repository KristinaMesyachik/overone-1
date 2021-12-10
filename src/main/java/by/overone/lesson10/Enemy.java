package by.overone.lesson10;

public class Enemy {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
        System.out.println("damage= " + damage + "\nhealth-damage= " + health);
    }

}
