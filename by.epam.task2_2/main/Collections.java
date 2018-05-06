package by.epam.task2_2.main;

import by.epam.task2_2.lists.ArrayListActions;
import by.epam.task2_2.lists.LinkedListActions;
import by.epam.task2_2.maps.Maps;
import by.epam.task2_2.sets.Sets;

public class Collections {
    public static void main(String[] args) {

        ArrayListActions a1 = new ArrayListActions(10000);
        LinkedListActions l1 = new LinkedListActions(10000);
        a1.add();
        l1.add();
        a1.print();
        l1.print();
        a1.get(25, 70, 64, 43);
        l1.get(25, 70, 64, 43);
        a1.removeElement(0, 10, 25, 1000);
        l1.removeElement(0, 10, 25, 1000);
        a1.update(50, 999);
        l1.update(50, 999);

        Sets hashAndTree = new Sets(1000);
        hashAndTree.add();
        hashAndTree.print();
        hashAndTree.get(10, 20, 97, 45);
        hashAndTree.removeElement(10, 20, 97, 45);
        hashAndTree.update(450, 999);

        Maps hashAndTreeMaps = new Maps(10000);
        hashAndTreeMaps.add();
        hashAndTreeMaps.print();
        hashAndTreeMaps.get(10,11,12,13);
        hashAndTreeMaps.removeElement(10,25,97,12);
        hashAndTreeMaps.update(450, 999);
    }


}
