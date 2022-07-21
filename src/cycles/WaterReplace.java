package cycles;

public class WaterReplace {
    private static int source = 30;
    private static int destination = 0;

    public static void main(String[] args) {
        while (source > 0) {
            source--;
            if (source % 10 != 0) {
                destination++;
            }
            System.out.println(source);
            System.out.println(destination);
        }
    }
}
