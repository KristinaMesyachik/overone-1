package by.overone.lesson28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        System.out.println("Main start");

        MyThread myThread = new MyThread(mainThread);
        System.out.println(myThread.getState());
//        myThread.setDaemon(true);
        myThread.start();
//        System.out.println(myThread.getState());
//        System.out.println(myThread.getState());
//        System.out.println(myThread.getState());
//        System.out.println(myThread.getState());
//        System.out.println(myThread.getState());
//        System.out.println(myThread.getState());
//        System.out.println(myThread.getState());


//        System.out.println(mainThread.getState());
        myThread.join(1500);
        System.out.println(myThread.getState());
//        System.out.println(mainThread.getState());


//        MyThread1 myThread1 = new MyThread1();
//        myThread1.start();

//        Thread thread = new Thread(new Runner());
//        thread.start();

//        Thread thread1 = new Thread(() -> System.out.println("My thread runnable"));
//        thread1.start();
//
//        System.out.println("Hello");
//        Thread thread = Thread.currentThread();
//        System.out.println(thread.getId());
//        System.out.println(thread.getName());
//        System.out.println(thread.getPriority());
//        System.out.println(thread);
    }

}

class MyThread extends Thread {

    public static volatile boolean flag = true;
    private Thread mainThread;

    public MyThread(Thread mainThread) {
        this.mainThread = mainThread;
    }

    public Thread getMainThread(){
        return mainThread;
    }

    @Override
    public void run() {
        System.out.println("MyThread start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(this.getMainThread().getState());
//        try {
//            Thread.sleep(10_000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("MyThread end");
//        while (flag) {
//            System.out.println("Something ...");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

//    public static void shutdown() {
//        flag = false;
//    }

}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 999; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}


