package com.java.functionalInterfaces;

@FunctionalInterface
interface Print {
    void draw();

    default void drawSquare() {
        System.out.println("Drawing Square Shape.");
    }

    default void drawRectangle() {
        System.out.println("Drawing Rectangle Shape.");
    }

    static void drawCircle() {
        System.out.println("Drawing Circle Shape.");
    }

}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Print demo = () -> System.out.println("Drawing Different Shape.");
        demo.draw();
        demo.drawSquare();
        demo.drawRectangle();
        Print.drawCircle();
    }
}
