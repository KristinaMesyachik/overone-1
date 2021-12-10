package robots;

import java.util.concurrent.atomic.AtomicLong;

public class MyThread extends Thread {
    private AtomicLong sum;

    public MyThread(AtomicLong sum) {
        this.sum = sum;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10_000_000; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum.addAndGet(i);
            }
            if (i % 1_000_000 == 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
