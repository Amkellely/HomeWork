public class Main {
    public static void main(String[] args) {
       // Array20. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти
        // сумму элементов массива с номерами от K до L включительно.
       /* Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int n, k, l;

        System.out.print("N: ");
        n = in.nextInt();

        System.out.print("K: ");
        k = in.nextInt();

        System.out.print("L: ");
        l = in.nextInt();

        for(int i = 0; i < n; ++i) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = k - 1; i <= l - 1; ++i) {
            sum += a[i];
        }

        System.out.print(sum + "\n: ");*/

        //Array21. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N).
        //Найти среднее арифметическое элементов массива с номерами от K до L
        //включительно.
        /* Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int n, k, l;

        System.out.print("N: ");
        n = in.nextInt();

        System.out.print("K: ");
        k = in.nextInt();

        System.out.print("L: ");
        l = in.nextInt();

        for(int i = 0; i < n; ++i) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = k - 1; i <= l - 1; ++i) {
            sum += a[i];
        }
        System.out.printf("%f\n: ", (float)sum / (float)(l - k + 1));*/
        // Array22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
        //сумму всех элементов массива, кроме элементов с номерами от K до L
        //включительно.
       /* Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int n, k, l;

        System.out.print("N: ");
        n = in.nextInt();

        System.out.print("K: ");
        k = in.nextInt();

        System.out.print("L: ");
        l = in.nextInt();

        for(int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "] : ");
            a[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < k - 1; ++i) {
            sum += a[i];
        }
        for(int i = l; i < n; ++i) {
            sum += a[i];
        }
        System.out.print(sum + "\n: ");*/

        // Array23. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N).
        //Найти среднее арифметическое всех элементов массива, кроме элементов
        //с номерами от K до L включительно.
        /* Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int n, k, l;

        System.out.print("N: ");
        n = in.nextInt();

        System.out.print("K: ");
        k = in.nextInt();

        System.out.print("L: ");
        l = in.nextInt();

        for(int i = 0; i < n; ++i) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < k - 1; ++i) {
            sum += a[i];
        }
        for(int i = l; i < n; ++i) {
            sum += a[i];
        }
        System.out.printf("%f\n: ", (float)sum / (float)(k - 1 + (n - l)));*/
    }
}