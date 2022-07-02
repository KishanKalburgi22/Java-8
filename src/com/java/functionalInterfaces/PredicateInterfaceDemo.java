package com.java.functionalInterfaces;

import java.util.function.Predicate;

// Traditional way
class PredicateImpl implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.length() > 5;
    }
}

public class PredicateInterfaceDemo {
    public static void main(String[] args) {

        // Traditional way
        PredicateImpl predicate = new PredicateImpl();
        System.out.println(predicate.test("Ramesh"));

        // Using Lambda Expressions
        Predicate<String> predicateWithLambda = (s) -> s.length() > 5;
        System.out.println(predicateWithLambda.test("Ram"));
    }
}
