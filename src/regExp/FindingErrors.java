package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingErrors {
    public static void main(String[] args) {
        String text = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";
        String[] sp = text.split(" ");

        for (String s : sp) {
            if (Pattern.matches(".*?Error", s)) {
                System.out.println(s);
            }
        }

    }
}
