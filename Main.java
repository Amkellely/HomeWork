import java.util.Arrays;
import java.util.Random;

public class Main {

    static void fillMatrix(int[][] fmas) {
        Random gen = new Random();
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                fmas[i][j] = gen.nextInt(10);
            }
        }
    }
    static void task20(int[][] fmas) {
        for (int k = 0; k < fmas[0].length; k++) {
            int p = 1;
            for (int i = 0; i < fmas.length; i++) {
                p *= fmas[i][k];
            }
        }
    }
    static int taskL1(int[][]  fmas){
        int sum = 0;
        for(int a = 0; a < fmas.length; a++){
            sum +=fmas[a][a];
        }
        return sum;
    }
    public void main(String[] args) {
        // Matrix 20. Дана матрица размера M × N. Для каждого столбца матрицы найти
        // произведение его элементов.
        final int n = 4;
        final int m = 5;
        int[][] mas = new int[n][m];
        fillMatrix(mas);
        System.out.println(Arrays.deepToString(mas));
        task20(mas);
        //Найти сумму элементов главной диагонали матрицы
        System.out.println(taskL1(mas));
        
        // Matrix 21.. Дана матрица размера M × N.
        // Для каждой строки матрицы с нечетным номером (1, 3, . . .) найти среднее арифметическое ее элементов.
        //Условный оператор не использовать.
        int num [] = {5, 8, 12, -18, -54, 84, -35, 17, 37};
        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/num.length);
    }
}
