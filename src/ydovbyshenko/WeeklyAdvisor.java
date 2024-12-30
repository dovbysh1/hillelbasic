package ydovbyshenko;

import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static Day fromString(String day) {
        return Day.valueOf(day.trim().toUpperCase());
    }
}

interface Advisor {
    void advise(Day day);
}

public class WeeklyAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Порада: Сконцентруйтесь на завданнях, щоб бути продуктивним на роботі.");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY ->
                    System.out.println("Вихідні! Рекомендуємо відвідати цікаві місця.");
        }
    }

    public static void main(String[] args) {
        WeeklyAdvisor advisor = new WeeklyAdvisor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть день тижня (наприклад, Monday, Tuesday):");
        String input = scanner.nextLine();

        try {
            Day day = Day.fromString(input);
            advisor.advise(day);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: Невірний день тижня. Спробуйте ще раз!");
        }

        scanner.close();
    }
}