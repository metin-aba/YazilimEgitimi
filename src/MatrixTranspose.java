import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int rows = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Eleman (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transposeMatrix = calculateTranspose(matrix);

        System.out.println("Matrisin transpozu:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[j][i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[][] calculateTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }
}
