/**
 * Клас, що містить методи для виконання множення матриць.
 *
 * @author Софія Жаботинська
 */
public class Calculate {
     /**
     * Перемножує дві матриці `matrix_A` та `matrix_B` та зберігає результат у `matrix_AxB`.
     * Розміри матриць повинні бути сумісними для множення:
     * кількість стовпців `matrix_A` повинна дорівнювати кількості рядків `matrix_B`.
     *
     * @param matrix_A перша матриця
     * @param matrix_B друга матриця
     * @param matrix_AxB матриця для зберігання результату множення
     * @return матриця `matrix_AxB` з результатом множення `matrix_A` та `matrix_B`
     */
    public static int[][] multiplicateMatrixs(int[][] matrix_A, int[][] matrix_B, int[][] matrix_AxB) {
        
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
