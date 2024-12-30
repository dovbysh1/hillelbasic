package ydovbyshenko;

import java.util.Scanner;
import java.util.Arrays;

public class Methods {

    public static void printSquare(int number) {
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number) + ".");
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static long power(int a, int b) {
        return (long) Math.pow(a, b);
    }

    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число:");
        int number = scanner.nextInt();
        printSquare(number);

        System.out.println("\nВведіть радіус циліндра:");
        double radius = scanner.nextDouble();
        System.out.println("Введіть висоту циліндра:");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume);

        int[] array = {10, 20, 30, 40, 50};
        System.out.println("\nМасив чисел: " + Arrays.toString(array));
        System.out.println("Сума всіх елементів масиву дорівнює " + sumArray(array));

        System.out.println("\nВведіть рядок:");
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("Рядок у зворотному порядку: " + reverseString(str));

        System.out.println("\nВведіть a:");
        int a = scanner.nextInt();
        System.out.println("Введіть b:");
        int b = scanner.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b));

        System.out.println("\nВведіть ціле число n:");
        int n = scanner.nextInt();
        System.out.println("Введіть текстовий рядок:");
        scanner.nextLine();
        String text = scanner.nextLine();
        printTextNTimes(n, text);

        scanner.close();
    }
}
