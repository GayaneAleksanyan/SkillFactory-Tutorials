package strings;

public class ComparingStrings {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Вован Иванов";
        checkUserName(user1, user2);
    }

    public static void checkUserName(String user1, String user2) {
        String user2copy = user2.replace(" ", "");

        if (user1.equalsIgnoreCase(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
        System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
        System.out.println("А без пробелов ваше имя занимает " + user2copy.length() + " символов");
    }
}
