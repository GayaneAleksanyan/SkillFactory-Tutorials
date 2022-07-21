package arrays;

public class SquarePrint {
    public static short size = 9;
    public static String[][] strings;

    public static void main(String[] args) {
        strings = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                strings[i][j] = (char) ('A' + j) + String.valueOf(size - i);
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(String.join(" ", strings[i]));
        }
    }
}
