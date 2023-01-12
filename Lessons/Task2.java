package Lessons;

/*
Для набора названий городов (города могут повторяться) нужно:
■ Показать все города;
■ Показать все города с названием длиннее шесть символов;
■ Посчитать сколько раз встречается город, чье название ввёл пользователь;
■ Показать все города, которые начинаются на заданную букву;
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List <String> Cities = new ArrayList<>();
        Cities.add("Амстердам");
        Cities.add("Берн");
        Cities.add("Будапешт");
        Cities.add("Абу-Даби");
        Cities.add("Буэнос-Айрес");
        Cities.add("Джорджтаун");
        Cities.add("Каир");
        Cities.add("Доха");
        Cities.add("Кито");
        Cities.add("Куала-Лумпур");
        Cities.add("Куала-Лумпур");
        Cities.add("Куала-Лумпур");
        Random gen = new Random();
        List<String> dupTowns = new ArrayList<>();
        final int dupSize = 30;
        for(int i = 0; i<dupSize;i++){
            dupTowns.add(Cities.get(gen.nextInt(Cities.size())));
        }
        System.out.println(dupTowns);
        dupTowns.stream().forEach(x -> System.out.println(x+" "));
        System.out.println();
        dupTowns.stream().filter(x -> x.length()> 6).forEach(x -> System.out.println(x + " "));
        System.out.println(dupTowns.stream().filter(x -> x.equals("Куала-Лумпур")).count());
        dupTowns.stream().filter(x -> x.charAt(0)=='К').forEach(x -> System.out.println(x +" "));
        System.out.println();
    }
}
