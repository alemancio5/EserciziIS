package main.java.ex15;

import java.util.Iterator;
import java.util.Stack;

public class MyStack extends Stack<Integer> {
    private Stack<Integer> fifo;
    private final Object lock = new Object();

    public MyStack () {
        this.fifo = new Stack();
    }

    public int myPush (int value) {
        synchronized (this.lock) {
            this.fifo.push (value);
            this.lock.notify();
            return value;
        }
    }

    public Integer myPop () {
        synchronized (this.lock) {
            while (this.fifo.isEmpty()) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {}
            }
            return this.fifo.pop();
        }
    }

    public void myPrint () {
        Iterator i = this.fifo.iterator();
        while (i.hasNext()) {
            System.out.println (i.next());
        }
    }
}
