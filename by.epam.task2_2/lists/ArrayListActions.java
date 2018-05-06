package by.epam.task2_2.lists;


import by.epam.task2_2.actions.IActions;
import by.epam.task2_2.countTime.CountTime;

import java.util.ArrayList;

import static java.lang.System.nanoTime;

public class ArrayListActions extends CountTime implements IActions {

    private ArrayList<Integer> arList = new ArrayList<>();

    private int maxSize;


    public ArrayListActions(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void add() {
        long startTime = nanoTime();
        for (int i = 0; i < maxSize; i++) {
            int a = (int) (Math.random() * 100);
            arList.add(a);
        }
        long endTime = nanoTime();
        System.out.println("The ArrayList was filled for := " + CountTime(startTime, endTime));

    }

    @Override
    public void print() {
        System.out.println("ArrayList : " + arList);

    }


    @Override
    public void removeElement(int index0, int index1, int index2, int index3) {
        long startTime = nanoTime();
        arList.remove(index0);
        arList.remove(index1);
        arList.remove(index2);
        arList.remove(index3);
        long endTime = nanoTime();
        System.out.println("The elements have been removed for := " + CountTime(startTime, endTime));
    }

    @Override
    public void get(int element0, int element1, int element2, int element3) {

        long startTime = nanoTime();
        int index0 = arList.indexOf(element0);
        int index1 = arList.indexOf(element1);
        int index2 = arList.indexOf(element2);
        int index3 = arList.indexOf(element3);
        long endTime = nanoTime();
        System.out.println("Your elements from ArrayList are: \n" + "Element:= " + element0 + " Index:=" + index0 + "\n"
                + "Element:= " + element1 + " Index:=" + index1 + "\n"
                + "Element:= " + element2 + " Index:=" + index2 + "\n"
                + "Element:= " + element3 + " Index:=" + index3 + "\n");
        System.out.println("The elements have been found for := " + CountTime(startTime, endTime));

    }

    @Override
    public void update(int index, int element) {

        System.out.println("The element that has index := " + index + " will be changed by element := " + element);
        long startTime = nanoTime();
        arList.set(index, element);
        long endTime = nanoTime();
        System.out.println("The array list was updated for := " + CountTime(startTime, endTime));
        //System.out.println("ArrayList : " + arList);

    }


}
