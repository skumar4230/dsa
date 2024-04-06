package org.example.multithreading;

public class Main {
    public static void main(String[] args) {
        //we can make use of runnable interface which is a functional interface and implements runn methods
        Runnable obj1 = () -> {
            while (true) {
                System.out.println("run method of obj1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        //we have to pass the object to thread to run
        Thread t1 = new Thread(obj1);
        Runnable obj2 = () -> {
            while (true) {
                System.out.println("run method of obj2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread t2 = new Thread(obj2);
        //        obj2.run();
        t1.start();
        t2.start();
        //we can also use this approach to directly use run method of runnable interface as thread needs runnable object which implement runs method
        Thread t3 = new Thread(() ->{
            while (true) {
                System.out.println("t3 started");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } );
        t3.start();
    }
}
