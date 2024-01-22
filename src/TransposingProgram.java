import java.util.Random;

public class TransposingProgram {
    public static void main(String[] args) {
        Random random = new Random();

        int m = 4;
        int n = 4;

        int[][] matrix1 = new int[m][n];

        System.out.println("Початкова матриця: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = random.nextInt(10);

                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposedM = transposeM(matrix1);

        System.out.println("Транспортована матриця: ");

        for (int i = 0; i < transposedM.length; i++) {
            for (int j = 0; j < transposedM[i].length; j++) {
                System.out.print(transposedM[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeM(int[][] matrix1) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] transposedM = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedM[j][i] = matrix1[i][j];
            }
        }
        return transposedM;
    }
}
