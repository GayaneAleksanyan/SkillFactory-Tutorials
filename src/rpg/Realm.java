package rpg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Realm {
    private static BufferedReader reader;
    private static Hero player = null;
    private static Battle battleScene = null;

    private static Merchant merchant = null;

    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        battleScene = new Battle();
        merchant = new Merchant();

        if (player == null) {
            System.out.println("Enter hero name:");
            try {
                player = new Hero(reader.readLine(), 100, 20, 20, 0, 30);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%s is willing to save our world from dragons!%n", player.getName());
            printNavigation();
        }
        try {
            command(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void command(String string) throws IOException {

        switch (string) {
            case "1" -> {
                player.buyPotion(merchant);
                printNavigation();
                command(reader.readLine());
            }
            case "2" -> commitFight();
            case "3" -> System.exit(1);
            case "yes" -> command("2");
            case "no" -> {
                printNavigation();
                command(reader.readLine());
            }
            default -> {
                System.out.println("Wrong command. Try again");
                printNavigation();
            }
        }

        command(reader.readLine());
    }

    private static void printNavigation() {
        System.out.println("Where do you want to go?");
        System.out.println("1. To Merchant");
        System.out.println("2. To Dark Forest");
        System.out.println("3. Exit");
    }

    private static void commitFight() {
        battleScene.fight(player, createMonster(), new FightCallBack() {

            @Override
            public void fightWin() {
                System.out.printf("%s won! Now you have %d exp и %d gold, and left %d health.%n", player.getName(), player.getExp(), player.getGold(), player.getHp());
                System.out.println("Do you want to continue or to return? (yes/no)");
                try {
                    command(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void fightLost() {
                System.out.println("Do you want to continue or to return? (yes/no)");
                try {
                    command(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    interface FightCallBack {
        void fightWin();

        void fightLost();

    }


    private static FantasyCharacter createMonster() {
        int random = (int) (Math.random() * 10);
        if (random % 2 == 0) {
            return new Goblin("Goblin", 50, 10, 10, 100, 10);
        } else if (random % 3 == 0) {
            return new Skeleton("Skeleton", 25, 15, 20, 50, 20);
        } else {
            return new Dragon("Dragon", 75, 30, 30, 150, 30);
        }
    }
}
