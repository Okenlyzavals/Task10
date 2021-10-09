package by.epam.training.task10;

import java.util.Scanner;

public class MatrixMaker {

    public static void main(String[] args) {
        int[][] matrix = makeMatrix(getOrderFromConsole());

        printMatrixToConsole(matrix);
    }

    public static int[][] makeMatrix(int order) {
        int[][] matrix = new int[order][order];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0, num = 0; col < matrix[row].length; col++, num++) {
                if (row % 2 == 0) matrix[row][col] = 1 + num;
                else matrix[row][col] = order - num;
            }
        }

        return matrix;
    }

    public static int getOrderFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the order of the matrix; it must be even.");

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Input type mismatch.");
        }

        int result = scanner.nextInt();

        if (result % 2 != 0) {
            System.out.println("The order must be even.");
            return getOrderFromConsole();
        } else if (result <= 0) {
            System.out.println("The order must be greater than 0.");
            return getOrderFromConsole();
        } else return result;

    }

    public static void printMatrixToConsole(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row)
                System.out.printf("|%10d", element);
            System.out.print("|\n");
        }
    }

}
