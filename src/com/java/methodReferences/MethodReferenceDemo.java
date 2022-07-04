package com.java.methodReferences;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
    void print(String msg);
}

public class MethodReferenceDemo {
    static int addition(int a, int b) {
        return a + b;
    }

    void display(String msg) {
        msg = msg.toLowerCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {

        // 1. Method reference to a static method

        // Lambda Expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // Using Method Reference
        Function<Integer, Double> functionWithRef = Math::sqrt;
        System.out.println(functionWithRef.apply(4));

        // Lambda Expression
        BiFunction<Integer, Integer, Integer> function1 = (a, b) -> MethodReferenceDemo.addition(a, b);
        System.out.println(function1.apply(10, 20));

        //Using Method Reference
        BiFunction<Integer, Integer, Integer> function1WithRef = MethodReferenceDemo::addition;
        System.out.println(function1.apply(10, 20));

        // 2. Method Reference to an instance method of the class
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        // Lambda Expression
        Printable printable = (input) -> methodReferenceDemo.display(input);
        printable.print("Ajay");

        // Using method reference
        Printable printable1 = methodReferenceDemo::display;
        printable1.print("Ajay");

        // 3. Reference to the instance method of an arbitrary object

        // Lambda Expression
        Function<String, String> function2 = (s) -> s.toLowerCase();
        System.out.println(function2.apply("HELLO"));

        // Using Method Reference
        Function<String, String> function2WithRef = String::toLowerCase;
        System.out.println(function2WithRef.apply("HELLO"));

        // 4. Reference to a constructor

        // Lambda Expression
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Ram", "Sham", "Arjun"));
        Function<List<String>, Set<String>> function3 = (List<String> s) -> new HashSet<>(s);
        System.out.println(function3.apply(arrayList));

        // Method Reference
        Function<List<String>, Set<String>> function3WithRef = HashSet::new;
        System.out.println(function3WithRef.apply(arrayList));
    }
}
