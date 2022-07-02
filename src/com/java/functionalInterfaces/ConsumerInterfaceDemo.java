package com.java.functionalInterfaces;

import java.util.function.Consumer;

// Traditional way
class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {

        // Traditional way
        ConsumerImpl consumer = new ConsumerImpl();
        consumer.accept("Ramesh");

        // Using lambda expressions
        Consumer<String> consumerWithLambda = (s) -> System.out.println(s);
        consumerWithLambda.accept("Laxman");
    }
}
