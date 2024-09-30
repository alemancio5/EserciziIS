package ex16;

public class MyMapThread extends Thread {
    private int id;
    private Integer key;
    private String value;
    private MyMap map;

    public MyMapThread (int id, Integer key, String value, MyMap map) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.map = map;
    }

    @Override
    public void run () {
        if (this.map.isFull())
            System.out.println("Thread " + this.id + " searchs " + (this.key - 1) + ": " + this.map.searchAndGet(this.key - 1));
        else
            System.out.println("Thread " + this.id + " inserts " + this.value + " in: " + this.map.insert(this.key, this.value));
    }
}
