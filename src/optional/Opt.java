package optional;

import java.util.Optional;
import java.util.Random;

public class Opt {
    public static void main(String[] args) {
        Optional<Optional<String>> g = Optional.of(checkGuess(3));
        System.out.println(g);

        String text = "Hello";
        Optional<String> opt = Optional.of(refactorText(text));
        System.out.println(opt.isPresent());

        Optional<Integer> optional = Optional.empty();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println(optional.orElseGet(() -> 5));
        }
    }

    private static String refactorText(String text) {
        if (text.length() >= 5) {
            return null;
        } else {
            return text + " refactored";
        }
    }

    private static Optional<String> checkGuess(int guess) {
        if (guess < 1 || guess > 5) {
            throw new IllegalStateException(); // проверяем на граничные условия
        } else {
            int result = new Random().nextInt(5) + 1; // генерируем рандом
            System.out.println(result);

            if (result == guess) { // делаем проверку
                return Optional.of("Поздравляем! Вы угадали значение!");
            } else {
                return Optional.empty();
            }
        }
    }
}