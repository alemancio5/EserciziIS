package main.java.pizza;

public class Oven {
    public void bake (Pizza p) {
        p.backedIn (this.type());
    }

    public String type () {
        return "oven";
    }
}
