package ex12;

public class Ditto extends Pokemon {
    public Ditto () {
        super ("Ditto", "Normal", 15, 85, 20);
    }

    public void attack (Pokemon def) {
        if (this.health >= 10) {
            this.type = def.getType();
        }
        super.attack(def);
    }

    public void refresh () {
        if (this.getHealth() < 10) {
            this.type = TYPE.NORMAL;
        }
        super.refresh();
    }
}