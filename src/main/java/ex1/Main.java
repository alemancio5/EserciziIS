package main.java.ex1;

public class Main {
    public static void main (String[] args) {
        IntSet A = new IntSet(10);

        A.delete(0);

        try {
            A.insert(99);
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }

        A.print();
    }
}