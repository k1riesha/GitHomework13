import java.util.Random;

public class TransposingProgram {

    public static void main(String[] args) {

        Random random = new Random();

        int m = random.nextInt(10);
        int n = random.nextInt(10);
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Матриця M x N: " + array1);


    }

}
