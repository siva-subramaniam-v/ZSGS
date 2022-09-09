import java.util.Scanner;

class MatrixMultiplication {
    
    static void multiplyAndPrint (int[][] matrix1, int[][] matrix2, int rowCount, int columnCount, int row2) {
        int[][] multipliedMatrix = new int[rowCount][columnCount];

        for (int i=0; i<rowCount; i++) {
            for (int j=0; j<columnCount; j++) {
                for (int k=0; k<row2; k++) {
                    multipliedMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i=0; i<rowCount; i++) {
            for (int j=0; j<columnCount; j++) {
                System.out.print(multipliedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no of rows of matrix 1: ");
        int row1 = input.nextInt(); 
        System.out.print("Enter no of columns of matrix 1: ");
        int col1 = input.nextInt();

        int[][] matrix1 = new int[row1][col1];

        System.out.print("\nEnter the elements of matrix 1: ");

        for (int i=0; i<row1; i++) {
            for (int j=0; j<col1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.print("\nEnter no of rows of matrix 2: ");
        int row2 = input.nextInt();
        System.out.print("Enter no of columns of matrix 2: ");
        int col2 = input.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication not possible");
            input.close();
            return;
        }

        int[][] matrix2 = new int[row2][col2];

        System.out.print("\nEnter the elements of matrix 2: ");

        for (int i=0; i<row2; i++) {
            for (int j=0; j<col2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        input.close();

        multiplyAndPrint(matrix1, matrix2, row1, col2, row2);
    }
}
