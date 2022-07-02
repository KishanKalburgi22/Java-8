package com.java.lambdaexpressions;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread started using ThreadDemo");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {

        // Traditional way of using Runnable interface
        Thread thread = new Thread(new ThreadDemo());
        System.out.println("Thread Id - " + thread.getId());
        thread.start();

        // Runnable interface using Lambda Expression
        Thread thread1 = new Thread(() -> System.out.println("Thread started using Lamdba Expression Thread"));
        System.out.println("Thread Id - " + thread1.getId());
        thread1.start();

    }
}
