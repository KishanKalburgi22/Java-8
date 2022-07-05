package com.java.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindElementsDemo {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(10, 4, 2, 22, 91, 2);
        array.stream().findFirst().ifPresent(System.out::println);

        array.stream().filter(v -> v > 10).findAny().ifPresent(System.out::println);

        System.out.println("Count of elements - " + array.stream().count());
        // Find Min
        Integer val = array.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min - " + val);

        // Find Max
        Integer val2 = array.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max - " + val2);
    }
}
