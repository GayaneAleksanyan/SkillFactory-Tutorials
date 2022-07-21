package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingFriend {
    public static void main(String[] args) {
        String text = "До свиданья, друг мой, до свиданья.\n" +
                "Милый мой, ты у меня в груди.\n" +
                "Предназначенное расставанье\n" +
                "Обещает встречу впереди.\n" +
                "\n" +
                "До свиданья, друг мой, без руки, без слова,\n" +
                "Не грусти и не печаль бровей,-\n" +
                "В этой жизни умирать не ново,\n" +
                "Но и жить, конечно, не новей.";
        Pattern pattern = Pattern.compile("[^.!?]*(друг)[^.!?]*[.!?]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
