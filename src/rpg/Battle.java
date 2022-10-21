package rpg;

public class Battle {
    public void fight(Hero hero, FantasyCharacter monster, Realm.FightCallBack fightCallBack) {
        Runnable runnable = () -> {
            int turn = 1;
            boolean isFightEnded = false;
            while (!isFightEnded) {
                System.out.println("----Turn: " + turn + "----");

                while (hero.getHp() <= 20 && hero.getPotion() > 0) {
                    hero.healHP();
                }
                if (turn++ % 2 != 0) {
                    isFightEnded = makeHit(monster, hero, fightCallBack);
                } else {
                    isFightEnded = makeHit(hero, monster, fightCallBack);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    private boolean makeHit(FantasyCharacter defender, FantasyCharacter attacker, Realm.FightCallBack fightCallBack) {
        int hit = attacker.attack();
        int defenderHealth = defender.getHp() - hit;
        if (hit != 0) {
            System.out.printf("%s Hit %d points!%n", attacker.getName(), hit);
            System.out.printf("%s left %d hp...%n", defender.getName(), defenderHealth);
        } else {
            System.out.printf("%s missed!%n", attacker.getName());
        }
        if (defenderHealth <= 0 && defender instanceof Hero) {
            System.out.println("Sorry, you died...");
            fightCallBack.fightLost();
            return true;
        } else if (defenderHealth <= 0) {
            System.out.printf("Enemy died! You get %d exp and %d gold %n", defender.getExp(), defender.getGold());
            attacker.setExp(attacker.getExp() + defender.getExp());
            attacker.setGold(attacker.getGold() + defender.getGold());
            attacker.checkLevelUp();
            fightCallBack.fightWin();
            return true;
        } else {
            defender.setHp(defenderHealth);
            return false;
        }
    }
}
