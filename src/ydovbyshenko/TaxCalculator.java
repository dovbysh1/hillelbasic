package ydovbyshenko;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sum income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.printf("Sum Tax: %.2f\n", tax);
    }

    private static double calculateTax(double income) {
        double tax;

        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = 10000 * 0.025 + (income - 10000) * 0.043;
        } else {
            tax = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
        }

            return tax;
        }
    }
