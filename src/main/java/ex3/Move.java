package ex3;

import java.util.Random;

public class Move {
    private static String WORD[] = {"SCISSOR", "PAPER", "ROCK"};
    private String word;

    private boolean check (String word) {
        for (int i = 0; i < WORD.length; i++) {
            if (WORD[i].equals(word))
                return true;
        }
        return false;
    }

    public Move (String word) {
        if (check(word)) {
            this.word = word;
        } else {
            Move t = new Move();
            this.word = t.word;
            System.out.println ("Error: Move " + word + " is not valid, set as " + this.word);
        }
    }

    public Move () {
        Random random = new Random();
        int position = random.nextInt(3);
        this.word = WORD[position];
    }

    public String getWord () {
        return this.word;
    }

}
