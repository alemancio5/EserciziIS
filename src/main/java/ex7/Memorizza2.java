package ex7;

public class Memorizza2<Type1, Type2> {
    private final Type1 element1;
    private final Type2 element2;

    public Memorizza2 (Type1 element1, Type2 element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public Type1 getElement1 () {
        return this.element1;
    }

    public Type2 getElement2 () {
        return this.element2;
    }

    public void print () {
        System.out.println (this.element1.toString() + " " + this.element2.toString());
    }
}
