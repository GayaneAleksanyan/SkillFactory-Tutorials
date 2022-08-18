package principlesOOP.rpgGame;

public abstract class Entity {
    private String name;
    private boolean destroyed;
    private int hp = 100;

    public Entity(String name) {
        this.name = name;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }
}
