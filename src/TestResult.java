import java.util.Arrays;

/**
 * Основний клас, що представляє головну точку входу програми для множення
 * матриць. Він генерує матриці випадкового розміру та заповнює їх випадковими
 * числами, потім виводить результат.
 *
 * @author Софія Жаботинська
 */
public class TestResult {

    public static void main(String[] args) {

        // Встановлення розміру матриці A

        // Заповнення та вивід матриці A
        int[][] matrix_A = {{1, 4}, {8, 0}, {2, 2}};
        System.out.println("\nМатриця A:");
        printMatrix(matrix_A);

        // Заповнення та вивід матриці B
        int[][] matrix_B = {{7, 2, 0, 9}, {1, 4, 1, 0}};
        System.out.println("\nМатриця B:");
        printMatrix(matrix_B);

        // Заповнення(клас Calculate реалізує цей метод) та вивід матриці AxB
        int[][] matrix_AxB = new int[matrix_A.length][matrix_B[0].length];
        matrix_AxB = Calculate.multiplicateMatrixs(matrix_A, matrix_B, matrix_AxB);
        System.out.println("\nРезультат множення матриць AxB:");
        printMatrix(matrix_AxB);

    }

    /**
     * Виводить матрицю на консоль.
     *
     * @param matrix матриця для виведення
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

    }
}