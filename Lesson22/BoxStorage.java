package Lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Создать коллекцию, содержащую объекты класса HeavyBox.
Распечатать его содержимое используя for each.
Изменить вес первого ящика на 1.
Удалить последний ящик.
Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
Удалить все ящики.
 */
public class BoxStorage {
    private List<HeavyBox> listOfBoxes;

    public BoxStorage(){
        listOfBoxes = new ArrayList<>();
    }
    public BoxStorage(ArrayList<HeavyBox> listOfBoxes){
        //Нельзя!!!! this.listOfBoxes = listOfBoxes;
        //надо скопировать содержимое параметра в содержимое поле

       /* for(int i = 0; i <listOfBoxes.size(); i++){
            this.listOfBoxes.add(listOfBoxes.get(i));
        }*/
        this();
        this.listOfBoxes.addAll(listOfBoxes);
        }

    @Override
    public String toString() {
        return "boxtest{" +
                "listOfBoxes=" + listOfBoxes +
                '}';
    }
    public boolean changeWeightOfBox(int index, int change) {
        boolean result = true;
        if (index < 0 || index > listOfBoxes.size() - 1) result = false;
        if (!listOfBoxes.get(index).changeWeight(change)) result = false;
            return result;
        }
}

