package by.overone.lesson28;

public class MainSychronized {
    public static void main(String[] args) {
        ClassX classX = new ClassX();
        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(new CustomerThread(classX));
            thread.start();
        }
    }
}
