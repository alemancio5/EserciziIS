package main.java.ex15;

public class MyStackThread extends Thread {
    private int id;
    private boolean mod;
    private MyStack fifo;

    public MyStackThread (int id, boolean mod, MyStack fifo) {
        this.id = id;
        this.mod = mod;
        this.fifo = fifo;
    }

    @Override
    public void run () {
        if (this.mod) {
            System.out.println ("Thread " + this.id + " pushs: " + this.fifo.myPush(this.id));
        } else {
            System.out.println ("Thread " + this.id + " pops: " + this.fifo.myPop());
        }
    }
}
