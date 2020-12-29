package com.my.project;

public class multiThreading {
    // Thread is a unit of processing
    // we're living in multicore cpu world
    // 8 cores. Any java app just uses 1 thread
    // sample uses: 1) Speed 2) async tasks android 3) servelets in webapp
    // there are 2 common ways to work with
    // threads, one is new Thread() another is
    // implements runnable(). Latter is an interface
    // so allows extending other classes for the thread
    // and hence is preferred
    public static void main(String[] args) throws InterruptedException {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        obj1.start();
        obj2.start();

    }

}

class Hi extends Thread
{
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Hello extends Thread{
    public void run() {
        for (int i=1;i<=5; i++){
        System.out.println(("Hello"));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
