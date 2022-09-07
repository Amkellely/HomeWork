package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Козловский Константин
       // Series 6. Дано целое число N и набор из N положительных вещественных чисел.
        // Вывести в том же порядке дробные части всех чисел из данного набора (как вещественные числа с нулевой целой частью), а также произведение всех дробных частей.
        /* Scanner in = new Scanner(System.in);
        double  r, pro=1;
        int i,n;
        System.out.println("N:");
        n=in.nextInt();
        for (i=1; i<=n; ++i){
            System.out.printf("%d:",i);
            r = in.nextDouble();
            System.out.printf("%f\n",r-(double)((int)r));
            pro*=r-(double)((int)r);
        }
        System.out.printf("%f\n",pro);*/
        // Series 7. Дано целое число N и набор из N вещественных чисел.
        // Вывести в том же порядке округленные значения всех чисел из данного набора (как целые числа), а также сумму всех округленных значений.
         /*Scanner in = new Scanner(System.in);
        double  r;
        int i,n,sum=0;
        System.out.println("N:");
        n = in.nextInt();
        for (i=1; i<=n; ++i){
            System.out.printf("%d:",i);
            r = in.nextDouble();
            System.out.printf("%d\n",(int)(r+(r>=0?0.5:-0.5)));
            sum+=(int)(r+(r>=0?0.5:-0.5));
        }
        System.out.printf("%d\n",sum);*/
        // Series 8. Дано целое число N и набор из N целых чисел. Вывести в том же порядке все четные числа из данного набора и количество K таких чисел.
        /*Scanner in = new Scanner(System.in);
        int i,n,k,num=0;
        System.out.println("N:");
        n = in.nextInt();
        for (i=1; i<=n; ++i){
            System.out.printf("%d:",i);
            k = in.nextInt();
            if (k%2==0){
                System.out.printf("%d\n",k);
                ++num;
            }
        }
        System.out.printf("%d\n",num);*/
        // Series 9. Дано целое число N и набор из N целых чисел. Вывести в том же порядке номера всех нечетных чисел из данного набора и количество K таких чисел.
         /*Scanner in = new Scanner(System.in);
        int i,n,k=0,r;
        System.out.println("N:");
        n = in.nextInt();
        for (i=1; i<=n; ++i){
            System.out.printf("%d:",i);
            r = in.nextInt();
            if (r%2!=0){
                System.out.printf("%d\n",r);
                ++k;
            }
        }
        System.out.printf("K:%d\n",k);*/
        // Series 10. Дано целое число N и набор из N целых чисел. Если в наборе имеются положительные числа, то вывести True; в противном случае вывести False.
        /*Scanner in = new Scanner(System.in);
        int i,n,r;
        boolean b=true;
        System.out.println("N:");
        n = in.nextInt();
        for (i=1; i<=n; ++i){
            System.out.printf("%d:",i);
            r = in.nextInt();
            if (r>0) b=true;
        }
        System.out.printf("%s\n",b?"True":"False");*/
        // Series 11. Даны целые числа K, N и набор из N целых чисел. Если в наборе имеются числа, меньшие K, то вывести True; в противном случае вывести False.
        /*Scanner in = new Scanner(System.in);
        int k,n,i,r;
        boolean b=false;
        System.out.println("N:");
        n = in.nextInt();
        System.out.println("K:");
        k = in.nextInt();
        for (i=1; i<=n; ++i){
            System.out.printf("%d:",i);
            r = in.nextInt();
            if (r<k) b=true;
        }
        System.out.printf("%s\n",b?"True":"False");}*/
        }
    }