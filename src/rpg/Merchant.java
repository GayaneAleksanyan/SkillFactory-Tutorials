package rpg;

public class Merchant implements Seller {

    @Override
    public void sell(Goods goods) {
        String result = "";
        switch (goods) {
            case POTION -> result = "potion";
            case ARMOR -> result = "armor";
            case WEAPON -> result = "weapon";
        }
    }

    public enum Goods {
        POTION,
        ARMOR,
        WEAPON;
    }
}
