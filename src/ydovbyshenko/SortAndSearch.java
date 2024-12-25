package ydovbyshenko;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int size = scanner.nextInt();
        int[] array = generate(size);
//        int[] array = {70, 69, 57, 52, 83, 92, 24, 100, 91, 100, 86, 4, 70, 35, 6};
        print(array);
        insertionSort(array);
        print(array);
        System.out.print("Search value: ");
        int value = scanner.nextInt();
        int position = binarySort(array, value);
        if (position < 0) {
            System.out.println("No element in array");
        } else {
            System.out.println(value + " at position " + position);
        }
    }

    private static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        return array;
    }

    private static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
    }

    public static int binarySort(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;
        do {
            int middle = (left + right) / 2;
            if (array[middle] > number) {
                right = middle - 1;
            } else if (array[middle] < number){
                left = middle + 1;
            } else {
                return middle;
            }

        } while (left <= right);
        return -1;
    }
}