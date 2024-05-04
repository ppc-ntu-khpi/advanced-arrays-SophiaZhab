/**
 * Клас, що містить методи для виконання множення матриць.
 *
 * @author Софія Жаботинська
 */
public class Calculate {
     /**
     * Перемножує дві матриці `matrix_A` та `matrix_B` та зберігає результат у `matrix_C`.
     * Розміри матриць повинні бути сумісними для множення:
     * кількість стовпців `matrix_A` повинна дорівнювати кількості рядків `matrix_B`.
     *
     * @param matrix_A перша матриця
     * @param matrix_B друга матриця
     * @param matrix_C матриця для зберігання результату множення
     * @return матриця `matrix_C` з результатом множення `matrix_A` та `matrix_B`
     * @throws IllegalArgumentException якщо розміри матриць не сумісні для множення
     */
    public static int[][] multiplicateMatrixs(int[][] matrix_A, int[][] matrix_B, int[][] matrix_AxB) {
        
        if ( matrix_A[0].length != matrix_B.length) {
            throw new IllegalArgumentException("The dimensions of the matrices are not compatible for multiplication");
        }
        
        for (int i = 0; i < matrix_A.length; i++) {
            for (int j = 0; j < matrix_B[0].length; j++) {
                for (int k = 0; k < matrix_A[0].length; k++) {
                    matrix_AxB[i][j] += matrix_A[i][k] * matrix_B[k][j];
                }
            }
        }
        return matrix_AxB;
    }

}
