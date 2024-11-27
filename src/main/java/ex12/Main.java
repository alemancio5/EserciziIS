package main.java.ex12;

public class Main {
    public static void main (String[] args) {
        Pokemon A = new Ditto();
        Pokemon B = new Pokemon ("Charizard", "Fire", 10, 140, 10);
        
        for ( ; ; ) {
            if (A.ko()) {
                System.out.println (B.getName() + " WIN");
                break;
            } else {
                System.out.println (A.getName() + " ATTACK!");
                A.attack(B);
                B.refresh();
                System.out.println (A.getName() + ": " + A.getHealth() + "HP\n" + B.getName() + ": " + B.getHealth() + "HP\n");
            }

            if (B.ko()) {
                System.out.println (A.getName() + " WIN");
                break;
            } else {
                System.out.println (B.getName() + " ATTACK!");
                B.attack(A);
                A.refresh();
                System.out.println (A.getName() + ": " + A.getHealth() + "HP\n" + B.getName() + ": " + B.getHealth() + "HP\n");
            }
        }
    }
}