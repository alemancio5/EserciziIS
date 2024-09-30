package ex14;

import java.util.Optional;

public class CounterThread extends Thread {
    private int id;
    private int move;
    private boolean sense;
    private Counter counter;

    public CounterThread (int id, int move, boolean sense, Counter counter) {
        this.id = id;
        if (move >= 0) {
            this.move = move;
        } else {
            this.move = 0;
        }
        this.sense = sense;
        this.counter = counter;
    }

    @Override
    public void run () {
        for (int i = 0; i < this.move; i++) {
            if (this.sense) {
                this.counter.increment();
                System.out.println ("CounterThread " + this.id + " increments");
            } else {
                this.counter.decrement();
                System.out.println ("CounterThread " + this.id + " decrements");
            }
        }
    }
}


