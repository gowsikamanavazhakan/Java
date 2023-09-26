import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columnsA = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columnsB = scanner.nextInt();

        if (columnsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] matrixA = new int[rowsA][columnsA];
            int[][] matrixB = new int[rowsB][columnsB];

            System.out.println("Enter elements for the first matrix:");
            inputMatrix(scanner, matrixA);

            System.out.println("Enter elements for the second matrix:");
            inputMatrix(scanner, matrixB);

            int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

            System.out.println("Result of matrix multiplication:");
            displayMatrix(resultMatrix);
        }
    }


    public static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }


    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }


    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
