package com.java.lambdaexpressions;

interface Shape {
    void draw();
}

// Traditional way of interface implementation
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle Shape : draw() method.");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square Shape : draw() method.");
    }
}

public class LambdaExample {
    public static void main(String[] args) {

        // Traditional way of calling implementing classes
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Square square = new Square();
        square.draw();

        // Using Lambda expressions
        Shape rectangleWithLambda = () -> System.out.println("Rectangle Shape : draw() method.");
        rectangleWithLambda.draw();

        Shape squareleWithLambda = () -> System.out.println("Square Shape : draw() method.");
        squareleWithLambda.draw();


        // Passing the lambda expressions directly into function as parameter
        print(() -> System.out.println("Rectangle Shape : draw() method."));
        print(() -> System.out.println("Square Shape : draw() method."));
    }

    public static void print(Shape shape) {
        shape.draw();
    }
}
