package main.java.ex16;
import java.util.HashMap;

public class MyMap {
    private HashMap<Integer, String> map;
    private int size;
    private int num;
    private final Object lock = new Object();

    public MyMap (int n) {
        this.map = new HashMap<Integer, String> ();
        this.size = n;
        this.num = 0;
    }

    public boolean isFull () {
        if (this.num >= this.size) {
            return true;
        } else {
            return false;
        }
    }

    public String searchAndGet (Integer key) {
        synchronized (this.lock) {
            String value = this.map.get (key);
            if (value != null) {
                this.map.remove (key);
                this.num--;
                this.lock.notifyAll();
                return value;
            }
            return "NULL";
        }
    }

    public Integer insert (Integer key, String value) {
        synchronized (this.lock) {
            while (this.isFull()) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {}
            }
            this.map.put (key, value);
            this.num++;
            return key;
        }
    }
}
