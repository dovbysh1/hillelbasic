package ydovbyshenko;

import java.util.Random;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        System.out.println("Матриця 4x4:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }

        int sumEvenRows = 0, sumOddRows = 0;
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
               rowSum += matrix[i][j];
            }
            if (i % 2 == 0) {
                sumEvenRows += rowSum;
            } else {
                sumOddRows += rowSum;
            }
        }

        long productEvenCols = 1, productOddCols = 1;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (j % 2 == 0) {
                    productEvenCols *= matrix[i][j];
                } else {
                    productOddCols *= matrix[i][j];
                }
            }
        }

        System.out.println("\nСума елементів у парних рядках (рядок 0, 2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + productEvenCols);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + productOddCols);

        if (isMagicSquare(matrix)) {
            System.out.println("\nМатриця є магічним квадратом.");
        } else {
            System.out.println("\nМатриця не є магічним квадратом.");
        }
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int magicSum = 0;

        for (int j = 0; j < size; j++) {
            magicSum += matrix[0][j];
        }

        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        for (int j = 0; j < size; j++) {
            int colSum = 0;
            for (int i = 0; i < size; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        int mainDiagonalSum = 0, secondaryDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][size - i - 1];
        }
        return mainDiagonalSum == magicSum && secondaryDiagonalSum == magicSum;
    }
}
