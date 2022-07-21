package cycles;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = scanner.nextLine();

        System.out.println("Enter password");
        String pass = scanner.nextLine();

        if (pass.length() < 8 || pass.length() > 15) {
            do {
                System.out.println("Password must contain 8 to 15 symbols");
                System.out.println("Enter password");
                pass = scanner.nextLine();
            } while (pass.length() < 8 || pass.length() > 15);
        }
        System.out.printf("Your username is %s, your password is %s", userName, pass);
    }
}
