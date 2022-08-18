package arrays;

import java.util.Arrays;
import java.util.Comparator;

//public class ComparatorByLength implements Comparator<String> {
//    @Override
//    public int compare(String arg0, String arg1) {
//        if (arg0 == null)
//            return 1;
//        if (arg1 == null)
//            return -1;
//        return arg0.length() - arg1.length();
//    }
//}

class Main {

    public static void main(String[] args) {
        String[] array = {"Apple", "Pineapple", "DragonFruit", "Orange", "Lime", "Cherry"};
        Arrays.sort(array, new Comparator<String>() {

            @Override
            public int compare(String arg0, String arg1) {
                if (arg0 == null) return 1;
                if (arg1 == null) return -1;
                return arg0.length() - arg1.length();
            }
        });

        System.out.println(Arrays.toString(array));
    }
}
