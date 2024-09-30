package ex6;

public class Point {
    private final double x;
    private final double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX () {
        return this.x;
    }

    public double getY () {
        return this.y;
    }

    public Point rotate (Point center, double degrees) {
        double rotated_x = center.x + (this.x - center.x) * Math.cos(degrees) - (this.y - center.y) * Math.sin(degrees);
        double rotated_y = center.y + (this.x - center.x) * Math.sin(degrees) + (this.y - center.y) * Math.cos(degrees);
        return new Point (rotated_x, rotated_y);
    }

    public String toString () {
        return ("x = " + this.x + " ; y = " + this.y);
    }
}
