package ex8;

import java.util.Iterator;
import java.util.Stack;

public class Lifo<Type> {
    private Stack<Type> lifo;

    public Lifo () {
        this.lifo = new Stack<Type> ();
    }

    public void lifo_push (Type element) {
        this.lifo.push (element);
    }

    public Type lifo_pop () {
        return this.lifo.pop();
    }

    public void lifo_print () {
        if (!this.lifo.isEmpty()) {
            Iterator<Type> i = this.lifo.iterator();
            while (i.hasNext()) {
                System.out.println (i.next());
            }
        }
    }
}
