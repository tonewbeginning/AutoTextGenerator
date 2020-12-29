package com.my.project;

public class multiThreadingRunnable {
    // Thread is a unit of processing
    // we're living in multicore cpu world
    // 8 cores. Any java app just uses 1 thread
    // sample uses: 1) Speed 2) async tasks android 3) servelets in webapp
    // there are 2 common ways to work with
    // threads, one is new Thread() another is
    // implements runnable(). Latter is an interface
    // so allows extending other classes for the thread
    // and hence is preferred
    // Runnable is a functional interface so we can use lambda
    // expressions.
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i=1;i<=5; i++){
                System.out.println(("Hi"));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread( () ->{
            for (int i=1;i<=5; i++){
                System.out.println(("Hello"));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        // if you remove the join then bye will execute before
        // t1 and t2 even complete.
        t1.join();
        t2.join();
        System.out.println("bye");
    }
}


