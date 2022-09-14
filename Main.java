import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Matrix 20.Дана матрица размера M × N. Для каждого столбца матрицы найти произведение его элементов.
        /*private static final int M = 5;
        private static final int N = 4;
        int[][] a = getMatrix();
        printMatrix(a);
        int[] products = getProducts(a);
        System.out.println(Arrays.toString(products));
        private static int[][] getMatrix() {
            int[][] a = new int[N][M];
            for (int i = 0; i < N; i++) {
                a[i] = ThreadLocalRandom.current().ints(5, 1, 3).toArray();
            }
            return a;
        }
        private static void printMatrix(int[][] a) {
            for (int i = 0; i < N; i++) {
                System.out.println(Arrays.toString(a[i]));
            }
        }
        private static int[] getProducts(int[][] a) {
            return Arrays.stream(a).mapToInt(line -> Arrays.stream(line).reduce(1, (x, y) -> x * y)).toArray();
        }*/
        //Matrix 21.Дана матрица размера M × N. Для каждой строки матрицы с нечетным номером (1, 3, …) найти среднее арифметическое ее элементов. Условный оператор не использовать.
           /*public class Test {
              public static void main(String[] args) {
                  int [] mas1 = new int[5];
                  int [] mas2 = new int[5];
                  for (int i = 0; i < 5; i++) {
                      mas1[i] = (int)(Math.random()*6);
                      mas2[i] = (int)(Math.random()*6);
                  }
                  System.out.println(Arrays.toString(mas1));
                  System.out.println(Arrays.toString(mas2));
                  double average1 = 0;
                  double average2 = 0;
                  for (int i = 0; i < 5; i++) {
                      average1 += mas1[i];
                      average2 += mas2[i];
                  }
                  average1/=5;
                  average2/=5;
                  if(average1 > average1){
                      System.out.println("Среднее арифметическое первого массива ("+average1+") больше среднего арифметического "+
                              "второго массива ("+average2+")");
                  } else if(average1 < average2){
                      System.out.println("Среднее арифметическое первого массива ("+average1+") меньше среднего арифметического "+
                              "второго массива ("+average2+")");
                  } else {
                      System.out.println("Средние арифметические массивов равны ("+average1+")");
                  }
              }
          }*/
    }
}