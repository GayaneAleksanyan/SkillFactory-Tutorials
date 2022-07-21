package arrays;

import java.util.Arrays;

public class RandomNumbers {
    public static int[] numbers = new int[100];

    public static void main(String[] args) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += (i + 1);

            if (numbers[i] % 2 == 0) {
                numbers[i] *= -1;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
