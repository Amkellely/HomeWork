package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Козловский Константин
            //If8◦ Даны два числа. Вывести вначале большее, а затем меньшее из них.
        /* Scanner in = new Scanner(System.in);
        int a1,a2;
        System.out.println("Введите перовое число: ");
        a1 = in.nextInt();
        System.out.println("Введите второе число:");
        a2= in.nextInt();
        if(a1>a2) System.out.println(a1+" "+a2);
        else System.out.println(a2+" "+a1); */
            //If10◦ . Даны две переменные целого типа: A и B. Если их значения не равны,
        //то присвоить каждой переменной сумму этих значений, а если равны,
        //то присвоить переменным нулевые значения. Вывести новые значения
        //переменных A и B.
       /* Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Введите перовое число a : ");
        a = in.nextInt();
        System.out.println("Введите второе число b :");
        b= in.nextInt();
        if (a!=b) a=b=a+b;
        else a=b=0; System.out.printf(" a: %d\n b: %d",a, b); */
            //If13◦ Даны три числа. Найти среднее из них (то есть число, расположенное
        //между наименьшим и наибольшим).
        /* Scanner in = new Scanner(System.in);
        int a1,a2,a3;
        System.out.println("Введите перовое число a : ");
        a1 = in.nextInt();
        System.out.println("Введите второе число b :");
        a2= in.nextInt();
        System.out.println("Введите третье число c : ");
        a3 = in.nextInt();
        if ((a1<=a2) & (a1<=a3)) System.out.printf("a: %d\n",a1);
        else if ((a2<=a1) & (a2<=a3)) System.out.printf("b: %d\n",a2);
        else System.out.printf("c: %d\n",a3);
        in.close(); */
            //If20◦ . На числовой оси расположены три точки: A, B, C. Определить, какая из
        //двух последних точек (B или C) расположена ближе к A, и вывести эту
        //точку и ее расстояние от точки A.
        /*Scanner in = new Scanner(System.in);
        float a,b,c;
        System.out.println("Введите координату точки a : ");
        a = in.nextFloat();
        System.out.println("Введите координату точки b :");
        b= in.nextFloat();
        System.out.println("Введите координату точки c : ");
        c = in.nextFloat();
        if (Math.abs(a-b)<Math.abs(a-c)) System.out.println("B\n");
        else System.out.println("C\n"); */
            //If21◦ Даны целочисленные координаты точки на плоскости.
        // Если точка совпадает с началом координат, то вывести 0.
        // Если точка не совпадает с началом координат, но лежит на оси OX или OY, то вывести соответственно 1
        //или 2. Если точка не лежит на координатных осях, то вывести 3.
        /* Scanner in = new Scanner(System.in);
        double x,y;
        System.out.println("Введите координаты точки: ");
        System.out.println("ведите координату X: ");
        x=in.nextDouble();
        System.out.println("ведите координату Y: ");
        y=in.nextDouble();
        if ( (x==0) & (y==0)) System.out.println("0");
        else if (x==0) System.out.println("1");
        else if (y==0) System.out.println("2");
        else System.out.println("3"); */
            //If24◦ Для данного вещественного x найти значение следующей функции f,
        //принимающей вещественные значения:
        //f (x) = 2·sin(x), если x > 0,
        //6 − x, если x ≤ 0.
       /* Scanner in = new Scanner(System.in);
        float x;
        System.out.println("Введите значение x :");
        x=in.nextFloat();
        if (x>0) System.out.println("F(x)="+(2*Math.sin(x)));
        else System.out.println("F(x)="+(6-x)); */
            //If26◦ Для данного вещественного x найти значение следующей функции f,
        //принимающей вещественные значения:
        //−x, если x ≤ 0,
        // f (x) = x2
        //, если 0 < x < 2,
        // 4, если x ≥ 2.
       /* Scanner in = new Scanner(System.in);
        float x;
        System.out.println("Введите значение x :");
        x=in.nextFloat();
        if (x<=0) System.out.println("F(x)="+((-1)*x));
        else if ((0<x)&(x<2)) System.out.println("F(x)="+(x*x));
        else System.out.println("F(x)="+4);*/
    }
}
