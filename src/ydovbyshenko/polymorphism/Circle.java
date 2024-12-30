package ydovbyshenko.polymorphism;

public class Circle implements Shape {
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реалізація методу calculateArea()
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
