package calculations;

import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value n: ");
        int n = scanner.nextInt();
        System.out.println("enter value x: ");
        int x = scanner.nextInt();
        Summ summ = new Summ();
        float result = summ.calculate(n, x);
        System.out.println("result = " + result);
    }
}

class Summ {
    public float calculate(float n, float x) {
        float result = 0f;
        for (int i = 1; i <= n; i++) {
            result = result + (x * x + 1) / i;
        }
        return result;
    }
}
