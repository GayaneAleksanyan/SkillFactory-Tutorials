package streamIONIO.wordCount;

import java.io.FileNotFoundException;

public class Text extends CountWords {
    public static void main(String[] args) throws FileNotFoundException {
        Text wordCount = new Text();
        System.out.println(wordCount.getCountWords());
    }
}
