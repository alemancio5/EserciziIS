package main.java.ex3;

public class Outcome {
    private Move A;
    private Move B;

    public Outcome (Move A, Move B) {
        this.A = A;
        this.B = B;
    }

    public void print () {
        System.out.println ("YOU: " + this.A.getWord() + "\n" + "PC: " + this.B.getWord());
        if ((this.A.getWord() == "SCISSOR" && this.B.getWord() == "PAPER") || (this.A.getWord() == "PAPER" && this.B.getWord() == "ROCK") || (this.A.getWord() == "ROCK" && this.B.getWord() == "SCISSOR")) {
            System.out.println ("YOU WIN!");
        } else if (this.A.getWord() == this.B.getWord()) {
            System.out.println ("TIE");
        } else {
            System.out.println ("YOU LOSE!");
        }
    }
}
