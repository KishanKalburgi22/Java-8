package com.java.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String email = "Ramesh@gmail.com";
//        String email = null;

        Optional<Object> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

//        Optional<String> optionalOf = Optional.of(email);
//        System.out.println(optionalOf);

        Optional<String> optionalOfNullable = Optional.ofNullable(email);
        System.out.println(optionalOfNullable);

//        String optionalGet = Optional.ofNullable(email).get();
//        System.out.println(optionalGet);

        String optionalOrElse = Optional.ofNullable(email).orElse("default@gmail.com");
        System.out.println(optionalOrElse);

//        String optionalOrElseThrow = Optional.ofNullable(email).orElseThrow(() -> new IllegalArgumentException("No Value Present in the variable."));
//        System.out.println(optionalOrElseThrow);

        Optional.ofNullable(email).ifPresent((s) -> System.out.println("Value Present"));

        String val = " abcd ";
        Optional.ofNullable(val)
                .map(String::trim)
                .filter(v -> v.contains("abc"))
                .ifPresent((v) -> System.out.println(v));
    }
}
