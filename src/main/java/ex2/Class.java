package main.java.ex2;

public class Class {
    private final int element;
    private static int counter = 0;

    public Class (int element) {
        this.element = element;
        counter++;
    }

    public int getElement () {
        return this.element;
    }

    public static int getCounter () {
        return counter;
    }
}
