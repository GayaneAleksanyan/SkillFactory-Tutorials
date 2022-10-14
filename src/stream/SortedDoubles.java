package stream;

import java.util.*;
import java.util.stream.Stream;

public class SortedDoubles {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");
//        List<Double> doubles = new ArrayList<>();
//        for (String s : list2) {
//            doubles.add(Double.valueOf(s));
//        }
//        Set<Double> sortedDoubles = new TreeSet<>(Comparator.reverseOrder());
//        sortedDoubles.addAll(list);
//        sortedDoubles.addAll(doubles);
//        for (double d : sortedDoubles) {
//            System.out.println(d);
//        }

        Stream.concat(
                        list.stream(),
                        list2.stream().map(Double::valueOf)
                )
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
