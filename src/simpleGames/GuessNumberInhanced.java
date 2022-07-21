package simpleGames;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberInhanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите максимальное количество попыток:");
        int turnQuantity = scanner.nextInt();

        System.out.println("Введите нижний предел числа:");
        int lowerBound = scanner.nextInt();

        System.out.println("Введите верхний предел числа:");
        int upperBound = scanner.nextInt();

        Random rand = new Random();
        int randInt;

        randInt = lowerBound + rand.nextInt(upperBound - lowerBound + 1);

        int counter = 1;

        boolean status = false;
        while (counter <= turnQuantity) {
            System.out.println("Введите число:");
            int userInput = scanner.nextInt();

            if (userInput == randInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                status = true;
                break;
            } else if (userInput > randInt) {
                System.out.println("Загаданное мною число меньше.");
            } else {
                System.out.println("Загаданное мною число больше.");
            }
            counter++;
        }

        if (!status) {
            System.out.println("Конец игры.");
            System.out.println("Мною было загадано число: " + randInt);
        }
    }
}
