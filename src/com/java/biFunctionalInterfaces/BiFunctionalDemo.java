package com.java.biFunctionalInterfaces;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BiFunctionalDemo {
    public static void main(String[] args) {

        // BiFunction
        BiFunction<Integer, Integer, Integer> biFunction1 = (a, b) -> a + b;
        System.out.println(biFunction1.apply(10, 20));

        Function<Integer, Integer> biFunction2 = (a) -> a * a;
        System.out.println(biFunction1.andThen(biFunction2).apply(3, 3));

        // BiConsumer
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(20, 30);

        // BiPredicate
        BiPredicate<Integer, Integer> biPredicate1 = (a, b) -> a > b;
        System.out.println(biPredicate1.test(20, 10));

        BiPredicate<Integer, Integer> biPredicate2 = (a, b) -> a < (a+b);
        System.out.println(biPredicate2.test(20, 10));

        System.out.println(biPredicate1.and(biPredicate2).test(30,-5));

        System.out.println(biPredicate1.or(biPredicate2).test(30,-5));



    }
}
