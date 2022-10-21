package rpg;

public class Hero extends FantasyCharacter {
    private int lvl = 1;
    private int potion;
    public Hero(String name, int hp, int strength, int dexterity, int exp, int gold) {
        super(name, hp, strength, dexterity, exp, gold);
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void buyPotion(Merchant merchant) {
        if (this.getGold() >= 10) {
            merchant.sell(Merchant.Goods.POTION);
            this.setPotion(this.getPotion() + 1);
            this.setGold(this.getGold() - 10);
            System.out.println("You bought a potion");
        } else {
            System.out.println("Not enough gold");
        }
    }

    @Override
    public void checkLevelUp() {
        while (this.getExp() >= 50) {
            this.setLvl(this.getLvl() + 1);
            this.setExp(this.getExp() - 50);
            System.out.printf("Level up! %d %n", this.getLvl());
        }
    }

    public void healHP() {
        this.setHp(this.getHp() * 3);
        this.setPotion(this.getPotion() - 1);
        System.out.println("HP healed");
    }
}
