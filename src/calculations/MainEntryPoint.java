package calculations;

import java.util.Scanner;

public class MainEntryPoint {
    public static void main(String[] args) {
        double result = Double.NaN;
        while (true) {
            UserInteraction ui = new UserInteraction(result);
            ui.parseInput();

            if (ui.IsExitCommand) return;

            CalCulator calculator = new CalCulator(ui.firstOperand, ui.secondOperand, ui.operation);

            try {
                result = calculator.calculate();
                ui.printResult(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class UserInteraction {
    private Scanner scanner = new Scanner(System.in);
    public boolean IsExitCommand = false;
    public double firstOperand = Double.NaN;
    public double secondOperand = Double.NaN;
    public char operation = 'c';

    public UserInteraction(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public boolean isReadyToCalulation() {
        return !Double.isNaN(firstOperand) && !Double.isNaN(secondOperand) && operation != 'c';
    }

    public void parseInput() {
        do {
            getNextInput();
        } while (!isReadyToCalulation() && !IsExitCommand);
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }

    private void getNextInput() {
        String s = scanner.next();

        if (s.equals("s")) {
            IsExitCommand = true;
        } else if (s.equals("c")) {
            clearState();
        } else if (s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
            operation = s.charAt(0);
        } else {
            tryParseDouble(s);
        }
    }

    private void clearState() {
        firstOperand = Double.NaN;
        secondOperand = Double.NaN;
        operation = 'c';
    }

    private void tryParseDouble(String s) {
        try {
            double d = Double.parseDouble(s);
            if (Double.isNaN(firstOperand)) {
                firstOperand = d;
            } else {
                secondOperand = d;
            }
        } catch (Exception e) {
            System.out.println("Incorrect input");
        }
    }
}

class CalCulator {
    double operand1;
    double operand2;
    char operation;

    CalCulator(double operand1, double operand2, char operation) {
        this.operation = operation;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double calculate() throws Exception {
        switch (operation) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new Exception("Invalid operaton");
        }
    }
}
