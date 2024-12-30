package ydovbyshenko.polymorphism;

public class Square implements Shape {
    private double side;

    // Конструктор
    public Square(double side) {
        this.side = side;
    }

    // Реалізація методу calculateArea()
    @Override
    public double calculateArea() {
        return side * side;
    }
}
