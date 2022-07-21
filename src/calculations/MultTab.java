package calculations;

public class MultTab {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" " + i * j + " ");
                }
            }
            System.out.println();
        }
    }
}
