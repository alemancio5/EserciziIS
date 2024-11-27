package main.java.ex7;

public class Memorizza1<Type1> {
    private final Type1 element;

    public Memorizza1 (Type1 element) {
        this.element = element;
    }

    public Type1 getElement () {
        return this.element;
    }

    public void print () {
        System.out.println (this.element.toString());
    }
}
