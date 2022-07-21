package cycles;

public class ConditionsAndCycles {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
        b = b + c;
        c = a - c;
        a = a - b;
        c = a + b;
        a = b + c;
        a = a + c + b;

        for (int i = 0; i < 20; i++) {
            System.out.println(a);
        }
    }
}
