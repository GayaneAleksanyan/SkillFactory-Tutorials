package calculations;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();
        int sum;

        switch (operation) {
            case '+' -> {
                sum = operand1 + operand2;
                System.out.println(sum);
            }
            case '-' -> {
                sum = operand1 - operand2;
                System.out.println(sum);
            }
            case '*' -> {
                sum = operand1 * operand2;
                System.out.println(sum);
            }
            case '/' -> {
                sum = operand1 / operand2;
                System.out.println(sum);
            }
            default -> System.out.println("неподдерживаемая операция");
        }

        scanner.close();
    }
}
