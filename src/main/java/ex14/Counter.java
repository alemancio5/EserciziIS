package main.java.ex14;

public class Counter {
    private int num;
    private final Object lock = new Object();

    public Counter () {
        this.num = 9;
    }

    public void increment () {
        synchronized (this.lock) {
            while (this.num == 10) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {}
            }
            this.num++;
            if (this.num == 1) {
                this.lock.notifyAll();
            }
        }
    }

    public void decrement () {
        synchronized (this.lock) {
            while (this.num == 0) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {}
            }
            this.num--;
            if (this.num == 9) {
                this.lock.notifyAll();
            }
        }
    }

    public int getNum () {
        return this.num;
    }

    public void reset () {
        this.num = 0;
    }
}
