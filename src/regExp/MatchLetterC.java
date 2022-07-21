package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchLetterC {
    public static void main(String[] args) {
        String text = "У Сени и Сани в сенях сом с усами";
        Pattern pattern = Pattern.compile("\\b[Сс][а-я]+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
