package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Circle");
        createObject("Square");
        createObject("Triangle");

    }

    public static Figures createObject(String className) {
        switch (className) {
            case "Circle":
                Circle circle = new Circle("Круг", 9);
                circle.print();
                return circle;
            case "Square":
                Square square = new Square("Квадрат", 4);
                square.print();
                return square;
            case "Triangle":
                Triangle triangle = new Triangle("Треугольник", 3, 5,7);
                triangle.print();
                return triangle;
        }
        return null;
    }
}
