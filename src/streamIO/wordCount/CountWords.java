package streamIO.wordCount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class CountWords {
    public int getCountWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\galex\\Documents\\SkillFactory\\Loader\\src\\streamIO\\wordCount\\text.txt"));
        int result = 0;

        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().split(" ");
            for (int i = 0; i < words.length; i++) {
                result++;
            }

        }

        return result;
    }
}
