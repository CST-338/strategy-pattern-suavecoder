import java.util.HashMap;

public class Imp extends Monster {

    public Imp(int maxHp, HashMap<String, Integer> items) {
        super(maxHp, items);
    }

    public Imp(int maxHp, int xp, HashMap<String, Integer> items) {
        super(maxHp, xp, items);
    }

    @Override
    public String toString() {
        return "Imp has : hp=" + getHp() + "/" + getMaxHp();
    }
}
