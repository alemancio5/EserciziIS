package main.java.ex14;

public class Main {
    public static void main (String[] args) {
        int n = 10;
        Counter A = new Counter();
        CounterThread B[] = new CounterThread[n];

        for (int i = 0; i < n; i++) {
            B[i] = new CounterThread (i, 1, (i % 2) == 0, A);
        }

        for (int i = 0; i < n; i++) {
            B[i].start();
        }

        for (int i = 0; i < n; i++) {
            try {
                B[i].join();
            } catch (InterruptedException e) {}
        }
    }
}
