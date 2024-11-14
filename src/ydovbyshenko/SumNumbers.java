package ydovbyshenko;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.print("Enter bound: ");
        Scanner scanner = new Scanner(System.in);
                int bound = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= bound; i++) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d%n", i, i, sum);
        }
        System.out.println("----------------------------");
        System.out.println(" Sum of numbers is " + sum);
    }
}
