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
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
        }
        System.out.println("----------------------------");
        System.out.println(" Sum of numbers is " + sum);

        System.out.println("\n\n\n");
        System.out.println(" -= WHILE LOOP =-");

        int i = 1;
        sum = 0;
        while (i <= bound) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
            i++;
        }
        System.out.println("----------------------------");
        System.out.printf(" Sum of numbers is %d", sum);

        System.out.println("\n\n\n");
        System.out.println(" -= DO WHILE LOOP =-");

        i = 1;
        sum = 0;
        do {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
            i++;
        } while (i <= bound);
        System.out.println("----------------------------");
        System.out.printf(" Sum of numbers is %d", sum);


    }
}
