package com.java.DefaultMethods;

interface Shape {
    void draw();

    default void printSize() {
        System.out.println("The size of the shape is 10 feet");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw function from Rectangle");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw function from Circle");
    }
}


public class DefaultMethodDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.printSize();

        Circle circle = new Circle();
        circle.draw();
    }
}
