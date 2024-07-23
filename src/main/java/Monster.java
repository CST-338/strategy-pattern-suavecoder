import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    private int hp;
    private int xp = 10; // Default value for xp
    private int maxHp;
    private HashMap<String, Integer> items;

    //** Constructor with maxHp and items
    public Monster(int maxHp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
       this.hp = this.maxHp;
        this.items = items;
    }

    // Constructor with maxHp, xp, and items
    public Monster(int maxHp, int xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        this.hp = this.maxHp;
        this.xp = xp;
        this.items = items;
    }

    // Getter and Setter for hp
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // Getter and Setter for xp
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    // Getter and Setter for maxHp
    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    // Getter and Setter for items
    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    // Overridden equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return hp == monster.hp && xp == monster.xp && maxHp == monster.maxHp && Objects.equals(items, monster.items);
    }

    // Overridden hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHp, items);
    }

    // Abstract toString method
    @Override
    public abstract String toString();
}
