package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Козловский Константин
       //Proc17. Описать функцию RootsCount(A, B, C) целого типа, определяющую
        //количество корней квадратного уравнения A·x
        //2 + B·x + C = 0 (A, B, C —
        //вещественные параметры, A 6= 0). С ее помощью найти количество корней
        //для каждого из трех квадратных уравнений с данными коэффициентами.
        //Количество корней определять по значению дискриминанта:
        //D = B
        //2 − 4·A·C.
        /*public static int rootscount(double a, double b, double c) {
            double d = b * b - 4 * a * c;
            if(d < 0) {
                return 0;
            }
            if(d == 0) {
                return 1;
            }
            if(d > 0) {
                return 2;
            }
            return 0;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double a, b, c;
            System.out.print("A:");
            a = in.nextDouble();
            System.out.print("B:");
            b = in.nextDouble();
            System.out.print("C:");
            c = in.nextDouble();
            System.out.println("rez:" + rootscount(a, b, c));
        }*/
        //Proc 18. Описать функцию CircleS(R) вещественного типа, находящую площадь круга радиуса R (R — вещественное). С помощью этой функции
        //найти площади трех кругов с данными радиусами. Площадь круга радиуса R вычисляется по формуле S = π·R
        //2
        //. В качестве значения π использовать 3.14.
        /*public static double circles(double r) {
            return (double)(3.14 * r * r);
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            for(int i = 1; i <= 3; ++i) {
                double r;
                System.out.print("R:");
                r = in.nextDouble();
                System.out.printf("S:%f\n", circles(r));
            }
        }*/
        //Proc 19. Описать функцию RingS(R1, R2) вещественного типа, находящую площадь кольца, заключенного между двумя окружностями с общим центром
        //и радиусами R1 и R2 (R1 и R2 — вещественные, R1 > R2). С ее помощью
        //найти площади трех колец, для которых даны внешние и внутренние радиусы. Воспользоваться формулой площади круга радиуса R: S = π·R
        //2
        //. В
        //качестве значения π использовать 3.14.
        /*public static double rings(double r1, double r2) {
            return (double)(3.14 * (r1 * r1 - r2 * r2));
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            for(int i = 1; i <= 3; ++i) {
                double r1, r2;
                System.out.print("R1:");
                r1 = in.nextDouble();
                System.out.print("R2:");
                r2 = in.nextDouble();
                System.out.printf("S:%f\n", rings(r1, r2));
            }
        }*/
        //Proc 20.  Описать функцию TriangleP(a, h), находящую периметр равнобедренного треугольника по его основанию a и высоте h, проведенной к
        //основанию (a и h — вещественные). С помощью этой функции найти
        //периметры трех треугольников, для которых даны основания и высоты.
        //Для нахождения боковой стороны b треугольника использовать теорему
        //Пифагора:
        //b
        //2 = (a/2)2 + h
        //2
         /*public static double trianglep(double a, double h) {
            return (double)(2 * Math.sqrt(Math.pow(a / 2, 2) + Math.pow(h, 2)) + a);
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            for(int i = 1; i <= 3; ++i) {
                double a, h;
                System.out.print("a:");
                a = in.nextDouble();
                System.out.print("h:");
                h = in.nextDouble();
                System.out.printf("P:%f\n", trianglep(a, h));
            }
        }*/
        //Proc 21. Описать функцию SumRange(A, B) целого типа, находящую сумму
        //всех целых чисел от A до B включительно (A и B — целые). Если A > B,.
        //то функция возвращает 0. С помощью этой функции найти суммы чисел
        //от A до B и от B до C, если даны числа A, B, C.
        /* public static int sumrange(int a, int b) {
            int sum = 0;
            for(; a <= b; ++a) {
                sum += a;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a, b, c;
            System.out.print("a:");
            a = in.nextInt();
            System.out.print("b:");
            b = in.nextInt();
            System.out.print("c:");
            c = in.nextInt();
            System.out.println("Sum:" + sumrange(a, b));
            System.out.println("Sum:" + sumrange(b, c));
        }*/
    }
     }


