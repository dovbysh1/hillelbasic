package ydovbyshenko.encapsulation;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Іван Іванов",
                "Програміст",
                "ivan.ivanov@example.com",
                "+380501234567",
                30
        );
        System.out.println("Інформація про співробітника:");
        employee.printInfo();

        System.out.println();

        Car car = new Car();
        System.out.println("Запуск автомобіля:");
        car.start();
    }
}
