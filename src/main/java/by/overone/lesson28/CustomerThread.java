package by.overone.lesson28;

public class CustomerThread implements Runnable {
    private ClassX classX;

    CustomerThread(ClassX classX) {
        this.classX = classX;
    }

    public void run() {
        synchronized (classX) {
            System.out.println("Я начал свою работу");
            classX.setX(1);
            for (int i = 0; i < 4; i++) {
                System.out.println(classX.getX());
                classX.increaseX();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Я закончил свою работу");
        }
    }
}
