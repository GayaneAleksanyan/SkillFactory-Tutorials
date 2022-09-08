package collections.pet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Pet> petList = new ArrayList<>();

        petList.add(new Pet("Cat", "Barsik", 2.7));
        petList.add(new Pet("Dog", "Bobik", 5.8));
        petList.add(new Pet("Parrot", "Kesha", 0.5));
        petList.add(new Pet("Dog", "Bob", 2.2));
        petList.add(new Pet("Pig", "Hrew", 9.4));
        petList.add(new Pet("Spider", "William", 0.06));
        petList.add(new Pet("Mouse", "Lu", 0.1));

        System.out.println(petList);

        System.out.println("\nСортировка по длине клички:");
        petList.sort(new ComparatorByNameLength());
        System.out.println(petList);

        Set<Pet> petSet = new TreeSet<>(petList);
        System.out.println("\nСортировка по весу:");
        System.out.println(petSet);
    }
}

