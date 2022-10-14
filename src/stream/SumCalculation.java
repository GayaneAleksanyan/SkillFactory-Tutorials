package stream;

import java.util.stream.IntStream;

public class SumCalculation {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        int sum = intStream
                .skip(50)
                .filter(integer -> integer % 2 == 0 || integer % 5 == 0)
                .sum();

        System.out.println(sum);
    }
}
