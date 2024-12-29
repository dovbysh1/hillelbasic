package ydovbyshenko.encapsulation;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Машина готова до роботи!");
    }

    private void startElectricity() {
        System.out.println("Електросистема активована.");
    }

    private void startCommand() {
        System.out.println("Команди отримані.");
    }

    private void startFuelSystem() {
        System.out.println("Паливна система запущена.");
    }
}
