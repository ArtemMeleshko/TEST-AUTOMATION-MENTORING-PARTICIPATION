package by.epam.task2_2.maps;

import by.epam.task2_2.actions.IActions;
import by.epam.task2_2.countTime.CountTime;

import java.util.HashMap;
import java.util.TreeMap;

import static java.lang.System.nanoTime;

public class Maps extends CountTime implements IActions {

    HashMap<Integer, String> hashMap = new HashMap<>();
    TreeMap<Integer, String> treeMap = new TreeMap<>();


    private int maxSize;

    public Maps(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void add() {
        long startTime = nanoTime();
        for (int i = 0; i < maxSize; i++) {
            int a = (int) (Math.random() * 100);
            hashMap.put(a, " Value_" + a);
        }
        long endTime = nanoTime();
        System.out.println("The HashSet was filled for := " + CountTime(startTime, endTime));

        long startTime1 = nanoTime();
        for (int i = 0; i < maxSize; i++) {
            int a = (int) (Math.random() * 100);
            treeMap.put(a, " Value_" + a);
        }
        long endTime1 = nanoTime();
        System.out.println("The TreeSet was filled for := " + CountTime(startTime1, endTime1));
    }

    @Override
    public void print() {
        System.out.println("HashMap : " + hashMap);
        System.out.println("TreeMap : " + treeMap);
    }


    @Override
    public void removeElement(int key1, int key2, int key3, int key4) {
        long startTime = nanoTime();
        hashMap.remove(key1);
        hashMap.remove(key2);
        hashMap.remove(key3);
        hashMap.remove(key4);
        long endTime = nanoTime();
        System.out.println("The elements have been removed from HashMap for := " + CountTime(startTime, endTime));
        System.out.println("HashMap : " + hashMap);

        long startTime1 = nanoTime();
        treeMap.remove(key1);
        treeMap.remove(key2);
        treeMap.remove(key3);
        treeMap.remove(key4);
        long endTime1 = nanoTime();
        System.out.println("The elements have been removed from TreeMap for := " + CountTime(startTime1, endTime1));
        System.out.println("TreeMap : " + treeMap);
    }

    @Override
    public void get(int key1, int key2, int key3, int key4) {
        long startTime = nanoTime();
        hashMap.get(key1);
        hashMap.get(key2);
        hashMap.get(key3);
        hashMap.get(key4);
        long endTime = nanoTime();
        System.out.println("The elements have been found in the HashMap for := " + CountTime(startTime, endTime));
        //System.out.println("1111" + hashMap.get(key1) + hashMap.get(key2) + hashMap.get(key3) + hashMap.get(key4));


        long startTime1 = nanoTime();
        treeMap.get(key1);
        treeMap.get(key2);
        treeMap.get(key3);
        treeMap.get(key4);
        long endTime1 = nanoTime();
        System.out.println("The elements have been found in the TreeMap for := " + CountTime(startTime1, endTime1));

    }

    @Override
    public void update(int key, int key1) {
        String value = "Value_999";
        long startTime = nanoTime();
        hashMap.replace(key,value);
        hashMap.replace(key1,value);
        long endTime = nanoTime();
        System.out.println("The HashMap has been updated for :=" + CountTime(startTime, endTime));
        System.out.println("HashMap : " + hashMap);

        long startTime1 = nanoTime();
        treeMap.replace(key,value);
        treeMap.replace(key1,value);
        long endTime1 = nanoTime();
        System.out.println("The TreeMap has been updated for :=" + CountTime(startTime1, endTime1));
        System.out.println("TreeMap : " + treeMap);



    }
}
