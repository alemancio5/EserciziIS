package ex3;

import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    public static String getInput () {
        scanner = new Scanner (System.in);
        return scanner.next();
    }

    public static void main (String[] args) {
        String input = getInput();
        Move A = new Move(input.toUpperCase());
        Move B = new Move();
        Outcome O = new Outcome (A, B);
        O.print();
    }
}