package by.epam.task2_2.sets;

import by.epam.task2_2.actions.IActions;
import by.epam.task2_2.countTime.CountTime;

import java.util.HashSet;
import java.util.TreeSet;

import static java.lang.System.nanoTime;

public class Sets extends CountTime implements IActions {
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    private int maxSize;

    public Sets(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void add() {
        long startTime = nanoTime();
        for (int i = 0; i < maxSize; i++) {
            int a = (int) (Math.random() * 100);
            hashSet.add(a); // can't add the same elements to set
        }
        long endTime = nanoTime();
        System.out.println("The HashSet was filled for := " + CountTime(startTime, endTime));

        long startTime1 = nanoTime();
        for (int i = 0; i < maxSize; i++) {
            int a = (int) (Math.random() * 100);
            treeSet.add(a);
        }
        long endTime1 = nanoTime();
        System.out.println("The TreeSet was filled for := " + CountTime(startTime1, endTime1));

    }


    @Override
    public void print() {
        System.out.println("HashSet : " + hashSet);
        System.out.println("TreeSet : " + treeSet);

    }


    @Override
    public void removeElement(int elem0, int elem1, int elem2, int elem3) {
        long startTime = nanoTime();
        hashSet.remove(elem0);
        hashSet.remove(elem1);
        hashSet.remove(elem2);
        hashSet.remove(elem3);
        long endTime = nanoTime();
        System.out.println("The elements have been removed from HeshSet for := " + CountTime(startTime, endTime));
        //System.out.println("HashSet : " + hashSet);

        long startTime1 = nanoTime();
        treeSet.remove(elem0);
        treeSet.remove(elem1);
        treeSet.remove(elem2);
        treeSet.remove(elem3);
        long endTime1 = nanoTime();
        System.out.println("The elements have been removed from TreeSet for := " + CountTime(startTime1, endTime1));
        //System.out.println("TreeSet : " + treeSet);

    }

    @Override
    public void get(int element0, int element1, int element2, int element3) {
        long startTime = nanoTime();
        hashSet.contains(element0);
        hashSet.contains(element1);
        hashSet.contains(element2);
        hashSet.contains(element3);
        long endTime = nanoTime();

        System.out.println("The elements have been found in the HashSet for := " + CountTime(startTime, endTime));

        long startTime1 = nanoTime();
        treeSet.contains(element0);
        treeSet.contains(element1);
        treeSet.contains(element2);
        treeSet.contains(element3);
        long endTime1 = nanoTime();

        System.out.println("The elements have been found in the TreeSet for := " + CountTime(startTime1, endTime1));
    }

    @Override
    public void update(int oldElement, int NewElement) {
        long startTime = nanoTime();
        for(Object i : hashSet)
            if(i.equals(oldElement)) {
                hashSet.remove(i);
                hashSet.add(NewElement);
                break;
            }
        long endTime = nanoTime();
        System.out.println("TThe HashSet has been updated for :=" + CountTime(startTime, endTime));
        System.out.println("HashSet : " + hashSet);

        long startTime1 = nanoTime();
        for(Object i : treeSet)
            if(i.equals(oldElement)) {
                treeSet.remove(i);
                treeSet.add(NewElement);
                break;
            }
        long endTime1 = nanoTime();
        System.out.println("The TreeSet has been updated for := " + CountTime(startTime1, endTime1));

        System.out.println("TreeSet : " + treeSet);
    }
}
