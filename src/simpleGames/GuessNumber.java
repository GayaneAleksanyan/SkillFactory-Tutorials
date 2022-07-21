package simpleGames;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt;
        randInt = rand.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число:");

            int possibleNumber = scanner.nextInt();

            if (possibleNumber == randInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                break;
            } else if (possibleNumber < randInt) {
                System.out.println("Загаданное мною число больше.");
            } else {
                System.out.println("Загаданное мною число меньше.");
            }
        }
    }
}