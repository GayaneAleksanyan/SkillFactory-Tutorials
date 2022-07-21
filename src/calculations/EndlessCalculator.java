package calculations;

import java.util.Scanner;

public class EndlessCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();
        int sum;

        outerloop:
        do {
            switch (operation) {
                case '+' -> {
                    sum = operand1 + operand2;
                    System.out.println(sum);
                    operand1 = sum;
                }
                case '-' -> {
                    sum = operand1 - operand2;
                    System.out.println(sum);
                    operand1 = sum;
                }
                case '*' -> {
                    sum = operand1 * operand2;
                    System.out.println(sum);
                    operand1 = sum;
                }
                case '/' -> {
                    sum = operand1 / operand2;
                    System.out.println(sum);
                    operand1 = sum;
                }
            }

            operation = scanner.next().charAt(0);

            switch (operation) {
                case 'C' -> {
                    operand1 = scanner.nextInt();
                    operation = scanner.next().charAt(0);
                }
                case 's' -> {
                    break outerloop;
                }
            }

            operand2 = scanner.nextInt();

        } while (true);
    }
}
