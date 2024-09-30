package ex15;

public class Main {
    public static void main (String args[]) {
        int n = 5;
        MyStack A = new MyStack ();
        MyStackThread B[] = new MyStackThread[n];

        for (int i = 0; i < n; i++) {
            B[i] = new MyStackThread (i, (i%2) == 0, A);
        }

        for (int i = 0; i < n; i++) {
            B[i].start();
        }

        for (int i = 0; i < n; i++) {
            try {
                B[i].join();
            } catch (InterruptedException e) {}
        }

        A.myPrint();
    }
}
