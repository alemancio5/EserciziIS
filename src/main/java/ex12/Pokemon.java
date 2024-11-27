package main.java.ex12;

public class Pokemon {
    enum TYPE {
        NORMAL,
        GRASS,
        FIRE,
        WATER
    }

    private final String name;
    private final int speed;
    protected TYPE type;
    private final int attack;
    protected int health;

    public Pokemon (String name, String stringtype, int attack, int health, int speed) {
        this.name = name.toUpperCase();
        this.speed = speed;

        try {
            this.type = TYPE.valueOf (stringtype.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println ("Error: Type " + stringtype + "is not valid, set as NORMAL");
            this.type = TYPE.NORMAL;
        }

        this.attack = attack;
        this.health = health;
    }

    private boolean supereffective (Pokemon def) {
        if (this.getType() != Pokemon.TYPE.NORMAL && (this.getType() == Pokemon.TYPE.FIRE && def.getType() == Pokemon.TYPE.GRASS || this.getType() == Pokemon.TYPE.GRASS && def.getType() == Pokemon.TYPE.WATER || this.getType() == Pokemon.TYPE.WATER && def.getType() == Pokemon.TYPE.FIRE)) {
            return true;
        } else {
            return false;
        }
    }

    public void attack (Pokemon def) {
        if (this.supereffective(def)) {
            def.health -= (this.getAttack() + (0.20 * this.getAttack()));
        } else {
            def.health -= this.getAttack();
        }
    }

    public void refresh () {
        if (this.getHealth() < 0)
            this.health = 0;
    }
    public boolean ko () {
        return (this.getHealth() == 0);
    }

    public String getName () {
        return this.name;
    }

    public int getSpeed () {
        return this.speed;
    }

    public TYPE getType () {
        return this.type;
    }

    public int getAttack () {
        return this.attack;
    }

    public int getHealth () {
        return this.health;
    }
}
