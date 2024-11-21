package ydovbyshenko;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            if (size < 0) {
                System.out.println("Wrong lenght  ");
            }
            System.out.println("Елементи масиву: ");
            size = scanner.nextInt();
        } while (size < 0);
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }

        System.out.print("[");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println("]");

        int sum = 0;
        for (int element : array) {
            if (element < 0) {
                sum += element;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sum);

        int evenCount = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }
        System.out.printf("Кількість парних чисел:  %d\nКількість непарних чисел:  %d\n", evenCount, array.length - evenCount);

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        System.out.printf("Найбільший елемент:  %d з індексом %d\n", array[maxIndex], maxIndex);
        System.out.printf("Найменьший елемент:  %d з індексом %d\n", array[minIndex], minIndex);

        int index = 0;
        while (index < array.length && array[index] >= 0 ) {
            index++;
        }
        System.out.println("Індекс: " + index);
        if (index >= array.length) {
            System.out.println("Від'ємних чисел немає!!!");
        }else {
            sum = 0;
            for (int i = index + 1; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + sum);
        }
    }
}
