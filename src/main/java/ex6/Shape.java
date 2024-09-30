package ex6;

import java.util.List;

public abstract class Shape {
    public Shape () {}
    public abstract double getArea ();
    public abstract double getPerimeter ();
    public abstract List<Point> getSequenceOfPointsToDraw();

    public void draw (TwoDimensionalCanvas canvas) {
        List<Point> points = this.getSequenceOfPointsToDraw();

        for(int i = 0; i < points.size() - 1; ++i) {
            canvas.drawLine ((Point)points.get(i), (Point)points.get(i + 1));
        }

        canvas.drawLine ((Point)points.get(points.size() - 1), (Point)points.get(0));
    }
}
