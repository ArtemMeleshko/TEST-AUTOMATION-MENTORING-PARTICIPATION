package by.epam.task2_2.lists;

import by.epam.task2_2.actions.IActions;
import by.epam.task2_2.countTime.CountTime;

import java.util.LinkedList;

import static java.lang.System.nanoTime;

public class LinkedListActions extends CountTime implements IActions {

    private LinkedList<Integer> linkedList = new LinkedList<>();

    private int maxSize;

    public LinkedListActions(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void add() {
        long startTime = nanoTime();
        for (int i = 0; i < maxSize; i++) {
            int a = (int) (Math.random() * 100);
            linkedList.add(a);
        }
        long endTime = nanoTime();
        System.out.println("The LinkedList was filled for := " + CountTime(startTime, endTime));

    }

    @Override
    public void print() {

        System.out.println("LinkedList : " + linkedList);
    }


    @Override
    public void removeElement(int index0, int index1, int index2, int index3) {
        long startTime = nanoTime();
        linkedList.remove(index0);
        linkedList.remove(index1);
        linkedList.remove(index2);
        linkedList.remove(index3);
        long endTime = nanoTime();
        System.out.println("The elements have been removed for := " + CountTime(startTime, endTime));

    }

    @Override
    public void get(int element0, int element1, int element2, int element3) {

        long startTime = nanoTime();
        int index0 = linkedList.indexOf(element0);
        int index1 = linkedList.indexOf(element1);
        int index2 = linkedList.indexOf(element2);
        int index3 = linkedList.indexOf(element3);
        long endTime = nanoTime();

        System.out.println("Your elements from LinkedList are: \n" + "Element:= " + element0 + " Index:=" + index0 + "\n"
                + "Element:= " + element1 + " Index:=" + index1 + "\n"
                + "Element:= " + element2 + " Index:=" + index2 + "\n"
                + "Element:= " + element3 + " Index:=" + index3 + "\n");
        System.out.println("The elements have been found for := " + CountTime(startTime, endTime));

    }

    @Override
    public void update(int index, int element) {

        System.out.println("The element that has index := " + index + " will be changed by element := " + element);
        long startTime = nanoTime();
        linkedList.set(index, element);
        long endTime = nanoTime();
        System.out.println("The linked list was updated for := " + CountTime(startTime, endTime));

        // System.out.println("LinkedList : " + linkedList);

    }

}
