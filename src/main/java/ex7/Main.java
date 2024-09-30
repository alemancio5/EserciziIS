package ex7;

public class Main {
    public static void main (String[] args) {
        Memorizza1<String> A = new Memorizza1 ("Ciao");
        Memorizza1<Integer> B = new Memorizza1 (3);
        Memorizza2<Boolean, String> C = new Memorizza2 (true, "Ciaone");

        if (C.getElement1() == true) {
            B.print();
        }
        C.print();
        A.print();
    }
}