package ex1;

public class IntSet {
    protected int element[];
    private int position;
    private int size;

    public IntSet (int set_size) {
        this.element = new int[set_size];
        for (int i = 0; i < set_size; i++) {
            this.element[i] = i;
        }
        this.position = set_size;
        this.size = set_size;
    }

    private boolean check (int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.element[i] == element)
                return false;
        }
        return true;
    }

    public void insert (int element) throws Exception {
        if (this.position < this.size) {
            if (check(element)) {
                this.element[this.position] = element;
            }
            this.position++;
        } else {
            throw new Exception ("Error: Array is full");
        }
    }

    public void delete (int position) {
        if (this.size > 0 && this.size > position) {
            this.element[position] = this.element[this.size - 1];
            this.position--;
        }
    }

    public void print () {
        for (int i = 0; i < this.size; i++) {
            System.out.print (this.element[i] + " ");
        }
        System.out.println();
    }
}
