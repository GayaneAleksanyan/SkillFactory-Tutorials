package rpg;

public abstract class FantasyCharacter implements Fighter {
    private String name;
    private int hp;
    private int strength;
    private int dexterity;
    private int exp;
    private int gold;


    public FantasyCharacter(String name, int hp, int strength, int dexterity, int exp, int gold) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.exp = exp;
        this.gold = gold;
    }

    @Override
    public int attack() {
        if (dexterity * 3 > getRandomValue()) {
            System.out.println("Super dexterity!");
            return strength;
        } else if (dexterity * 3 <= getRandomValue()) {
            return 0;
        } else if (strength * 5 > getRandomValue()) {
            System.out.println("Fatal blow!");
            return strength * 2;
        } else {
            return strength;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp > 100) {
            this.hp = 100;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }


    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    public void checkLevelUp() {
    }

    @Override
    public String toString() {
        return String.format("%s health:%d", name, hp);
    }


}
