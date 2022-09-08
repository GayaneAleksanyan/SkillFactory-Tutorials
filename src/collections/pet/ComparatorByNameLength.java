package collections.pet;

import java.util.Comparator;

public class ComparatorByNameLength implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        return o2.getName().length() - o1.getName().length();
    }
}
