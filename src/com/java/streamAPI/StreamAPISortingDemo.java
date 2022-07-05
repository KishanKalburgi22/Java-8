package com.java.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamAPISortingDemo {
    public static void main(String[] args) {
        //Sort By Ascending order
        getProducts().stream().sorted().forEach(System.out::println);

        getProducts().stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("******************************");
        getProducts().stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);

        System.out.println("##############################");
        //Sort By Descending order
        getProducts().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("******************************");
        getProducts().stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);

        System.out.println("################################");
        // Sort Products by name
        getProducts().stream().sorted(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return product.name.compareTo(t1.name);
            }
        }).forEach(System.out::println);

        System.out.println("################################");

        // Using lambda
        getProducts().stream().sorted((p1, p2) -> p1.name.compareTo(p2.name)).forEach(System.out::println);

        System.out.println("################################");

        // Using comparing method
        getProducts().stream().sorted(Comparator.comparing(p -> p.name)).forEach(System.out::println);
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
