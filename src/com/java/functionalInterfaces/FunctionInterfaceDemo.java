package com.java.functionalInterfaces;

import java.util.function.Function;

// Traditional way of implementing the interface
class FunctionImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionInterfaceDemo {
    public static void main(String[] args) {

        // Traditional way
        FunctionImpl function = new FunctionImpl();
        System.out.println(function.apply("Ramesh"));

        // Using Lambda Expression
        Function<String, Integer> functionWithLambda = (s) -> s.length();
        System.out.println(functionWithLambda.apply("Ram"));

    }
}
