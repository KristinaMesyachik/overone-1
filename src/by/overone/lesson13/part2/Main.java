package by.overone.lesson13.part2;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Andrei");
        User user1 = new User(1, "Maksim");
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}
