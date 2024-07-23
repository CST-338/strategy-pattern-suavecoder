import java.util.HashMap;

public class Kobold extends Monster {

    public Kobold(int maxHp, HashMap<String, Integer> items) {
        super(maxHp, items);
    }

    public Kobold(int maxHp, int xp, HashMap<String, Integer> items) {
        super(maxHp, xp, items);
    }

    @Override
    public String toString() {
        return "Kobold has : hp=" + getHp() + "/" + getMaxHp();
    }
}
