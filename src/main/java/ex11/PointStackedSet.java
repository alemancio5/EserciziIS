package ex11;

import java.util.Iterator;
import java.util.Stack;

public class PointStackedSet extends Stack<Point> {
    private Stack<Point> lifo;

    public PointStackedSet () {
        this.lifo = new Stack<Point> ();
    }

    public void lifo_push (Point point) {
        this.lifo.add (point);
    }

    public Point lifo_pop () {
        return this.lifo.pop();
    }

    public void lifo_print () {
        if (!this.lifo.isEmpty()) {
            Iterator<Point> i = this.lifo.iterator();
            while (i.hasNext()) {
                Point t = i.next();
                System.out.println (t.getX() + " " + t.getY());
            }
        }
    }

    public boolean lifo_search (Point point) {
        if (!this.lifo.isEmpty()) {
            Iterator<Point> i = this.lifo.iterator();
            while (i.hasNext()) {
                if (i.next().equals(point)) {
                    return true;
                }
            }
        }
        return false;
    }
}
