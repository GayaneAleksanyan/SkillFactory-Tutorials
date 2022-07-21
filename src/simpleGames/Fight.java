package simpleGames;

public class Fight {
    public static void main(String[] args) {
        Ork ork = new Ork();
        Elf elf = new Elf();
        fight(ork, elf);
    }

    private static void fight(Ork ork, Elf elf) {
        while (true) {
            if (!ork.isOrkAlive && elf.isElfAlive) {
                System.out.println("simpleGames.Ork is dead. simpleGames.Elf win!");
                break;
            } else if (ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println("simpleGames.Elf is dead. simpleGames.Ork win!");
                break;
            } else if (!ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println("All is dead...");
                break;
            }
            if (elf.health < 0) {
                elf.isElfAlive = false;
            } else {
                elf.health -= ork.kickPower;
            }
            if (ork.health < 0) {
                ork.isOrkAlive = false;
            } else {
                ork.health -= elf.kickPower;
            }
        }
    }
}

class Ork {
    String name = "someOrk";
    public int health = 100;
    public int kickPower = 10;
    public boolean isOrkAlive = true;
}

class Elf {
    String name = "someElf";
    public int health = 100;
    public int kickPower = 20;
    public boolean isElfAlive = true;
}
