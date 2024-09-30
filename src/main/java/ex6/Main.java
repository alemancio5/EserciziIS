package ex6;

public class Main {
    public static void main (String[] args) {
        Square square = new Square (new Point (-3, -4), 5.0,5.0);
        TwoDimensionalCanvas canvas = new BasicCanvas (1024, 1024, new Point(-10.0, -10.0), new Point(10.0, 10.0));
        square.draw (canvas);
    }
}