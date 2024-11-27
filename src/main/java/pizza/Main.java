package main.java.pizza;

public class Main {
    public static void main (String arg[]) {
        Pizza veg = new VegetablePizza();
        Pizza chs = new CheesePizza();
        CheesePizza chs1 = new CheesePizza();
        Oven ov = new Oven();
        Oven ex = new ExpressOven();
        ExpressOven ex1 = new ExpressOven();

        ov.bake (veg);
        ov.bake (chs);
        ov.bake (chs1);
        ex1.bake (veg);
        ex1.bake (chs);
        ex1.bake (chs1);
        ex.bake (veg);
        ex.bake (chs);
        ex.bake (chs1);
    }
}
