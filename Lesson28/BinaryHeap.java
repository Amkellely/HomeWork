package Lesson28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryHeap<T extends Comparable<T>> {
    private ArrayList<T> elements;

    public BinaryHeap(){
        elements = new ArrayList<>();
    }

    public BinaryHeap(T[] array){
        elements = new ArrayList<>(Arrays.asList(array));
        for(int i = elements.size() / 2 - 1; i>= 0; --i){
            siftDown(i);
        }
    }
    private void siftUp(int i){
        while(i > 0){
            int parent = (i -1) / 2;
            if(elements.get(i).compareTo(elements.get(parent)) < 0)
                return;
            Collections.swap(elements, i, parent);
            i = parent;
        }
    }
    public void add(T element){
        elements.add(element);

        siftUp(elements.size() - 1);
    }

    public boolean isEmpty(){
        return elements.size() == 0;
    }
    public List<T> getElements(){
        return new ArrayList<>(elements);
    }

    private void siftDown(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int largest = i;
        if (left < elements.size() && elements.get(left).compareTo(elements.get(i)) > 0) {
            largest = left;
        }
        if (left < elements.size() && elements.get(right).compareTo(elements.get(largest)) > 0) {
            largest = left;
        }
        if(largest != 1){
            Collections.swap(elements, i, largest);
        }
    }
    public T extractMax(){
        if(!isEmpty()){
            T result = elements.get(0);
            //elements[0] = elements[elements.lenght - 1];
            Collections.swap(elements, 0, elements.size()-1);
            elements.remove(elements.size()-1);
            if(!isEmpty()){
                siftDown(0);
            }
            return result;
        }
        return null;
    }
}
