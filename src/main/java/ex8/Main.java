package main.java.ex8;

public class Main {
    public static void main (String[] args) {
        Lifo<String> A = new Lifo();
        A.lifo_push ("Ale");
        A.lifo_push ("Palla");
        A.lifo_push ("Cielo");
        A.lifo_print();
        A.lifo_pop();
        A.lifo_push ("Casa");
        A.lifo_print();
    }
}