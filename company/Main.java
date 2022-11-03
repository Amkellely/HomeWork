package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        final List<Integer> l1 = new ArrayList<>();
        final List<Integer> l2 = new ArrayList<>();
        for(int i =1; i<=5; i++){
        l1.add(1); l1.add(2); l1.add(3); l1.add(4); l1.add(5);
    }
        l2.addAll(l1);
        l1.clear();
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);

        //Задача 2. Вывести второй список с помощью итератора

        Iterator<Integer> itr = l2.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+ " " );
        }
    }
}
