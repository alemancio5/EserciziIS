package ex11;

public class Main {
    public static void main (String[] args) {
        PointStackedSet pss = new PointStackedSet();
        pss.lifo_push (new Point (4, 6));
        pss.lifo_push (new Point (4, 66));
        pss.lifo_print();
        pss.lifo_pop();
        Point A = new Point(55, 43);
        pss.lifo_push (A);
        pss.lifo_print();
        if (pss.lifo_search(A)) {
            System.out.println ("Point found");
        } else {
            System.out.println ("Point not found");
        }
    }
}