package main.java.intertry;

public class Main {
    public static void main (String args[]) {
        double total;
        Sale s = new SaleAutumn();
        total = s.totConSconto();
        System.out.println(total);
        total = s.totSenzaSconto();
        System.out.println(total);
    }
}
