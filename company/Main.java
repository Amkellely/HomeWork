package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        Scanner in= new Scanner(System.in);
	while (true){
	    printMenu();
        int choice;
	    choice = in.nextInt();
	        switch (choice){
                case 1: break;
                addElem();
                case 2: break;
                removeElem(list);
                case 3: break;
                containsElem(list);
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9: return;
                default:
                    System.out.println(" Ошибка = Нет такого пункта");
        }
    }
    }
    static void printMenu(){
        System.out.println("Добавить элемент в список.");
        System.out.println("Удалить элемент из списка.");
        System.out.println("Показать содержимое списка.");
        System.out.println("Проверить есть ли значение в списке.");
        System.out.println("Заменить значение в списке.");
        System.out.println("Выход");
        System.out.println("Введите номер нужного пункта: ");
    }
    static void addElem(List<String> list) {
        if (list != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Ввведите строку");
            String str = in.nextLine();
            list.add(str);
        } else {
            System.out.println("Список пуст");
        }
    }
    static void removeElem(List<String> list){
        if (list != null) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите номер строки котору нужно удалить: ");
        String str = in.nextLine();
            if(str!=null);
            System.out.println(list.remove(str));
             }
        }

    static void printList(List<String> list){
        if (list != null) {
            Scanner in= new Scanner(System.in);
            String str = in.nextLine();
        for(String i: list){
        System.out.println(" " +i);
                }
            }
        else {
            System.out.println("Список пуст");
            }
          }
    static void containsElem(List<String> list){
        if(list !=null);
        System.out.println("Список пуст");
    }else
            System.out.println("Список пуст");
        }

