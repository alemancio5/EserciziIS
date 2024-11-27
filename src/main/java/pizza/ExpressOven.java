package main.java.pizza;

public class ExpressOven extends Oven {
    public void bake (CheesePizza p) {
        p.backedIn ("very " + this.type());
    }

    public void bake (VegetablePizza p) {
        p.backedIn ("really " + this.type());
    }

    public String type () {
        return "fast oven";
    }
}
