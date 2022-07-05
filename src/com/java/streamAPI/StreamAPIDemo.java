package com.java.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamAPIDemo {
    public static void main(String[] args) {

        List<String> array = Arrays.asList("a", "b", "c");
        Stream<String> stream1 = array.stream();
        stream1.forEach(System.out::println);

// Traditional way to filter based on price;

        ArrayList<Product> list = new ArrayList<>();

        for (Product p : getProducts()) {
            if (p.getPrice() < 100) {
                list.add(p);
            }
        }

        for (Product p : list) {
            System.out.println(p.name + " --> " + p.price);
        }
        System.out.println("******************************************");
        // Using Stream API
        getProducts().stream()
                .filter(p -> p.price < 100)
                .forEach(System.out::println);
    }

    static List<Product> getProducts() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Pen", 10));
        productList.add(new Product("Book", 20));
        productList.add(new Product("Pencil", 2));
        productList.add(new Product("Iphone", 10000));
        return productList;
    }
}
