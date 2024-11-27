package main.java.ex16;

public class Main {
    public static void main (String args[]) {
        int n = 20;
        MyMap A = new MyMap (5);
        MyMapThread B[] = new MyMapThread[n];

        for (int i = 0; i < n; i++) {
            B[i] = new MyMapThread (i, i, "PRESENT", A);
        }

        for (int i = 0; i < n; i++) {
            B[i].start();
        }

        for (int i = 0; i < n; i++) {
            try {
                B[i].join();
            } catch (InterruptedException e){}
        }
    }
}
