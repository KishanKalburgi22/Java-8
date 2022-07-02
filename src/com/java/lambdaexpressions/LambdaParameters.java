package com.java.lambdaexpressions;

interface Addable {
    int add(int a, int b);
}

public class LambdaParameters {
    public static void main(String[] args) {

        Addable sum = (a, b) -> (a + b);
        System.out.println(sum.add(10, 20));
    }
}
