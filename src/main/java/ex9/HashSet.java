package main.java.ex9;

import java.util.AbstractSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashSet<Type> extends AbstractSet<Type> implements Set<Type> {
    private transient HashMap<Type, Object> map;
    private static final Object PRESENT = new Object();

    public HashSet () {
        this.map = new HashMap();
    }

    public Iterator<Type> iterator () {
        return this.map.keySet().iterator();
    }

    public int size () {
        return this.map.size();
    }

    public boolean isEmpty () {
        return this.map.isEmpty();
    }

    public boolean contains (Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean add (Type Type) {
        return this.map.put(Type, PRESENT) == null;
    }

    public boolean remove (Object o) {
        return this.map.remove(o) == PRESENT;
    }

    public void clear() {
        this.map.clear();
    }

    public void print() {
        System.out.println(this.map.size());
    }

    public static void main (String[] args) {
        HashSet<Integer> hash = new HashSet();
        hash.clear();
        hash.add(3);
        hash.add(4);
        hash.add(5);
        hash.print();
    }
}
