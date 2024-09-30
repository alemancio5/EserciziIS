package ex6;

import java.util.ArrayList;
import java.util.List;

public class Square extends Shape {
    private final Point point;
    private final double orientation;
    private final double side;

    public Square (Point point, double orientation, double side) {
        if (point != null && !(side < 0.0) && !(orientation < 0.0) && !(orientation > 6.283185307179586)) {
            this.point = point;
            this.orientation = orientation;
            this.side = side;
        }
        else {
            throw (new IllegalArgumentException());
        }
    }

    public double getArea () {
        return this.side * this.side;
    }

    public double getPerimeter () {
        return 4.0 * this.side;
    }

    public List<Point> getSequenceOfPointsToDraw () {
        List<Point> points = new ArrayList();
        points.add (this.point);
        Point nonOrientedSecondPoint = new Point (this.point.getX(), this.point.getY() + this.side);
        points.add (nonOrientedSecondPoint.rotate(this.point, this.orientation));
        Point nonOrientedThirdPoint = new Point (this.point.getX() + this.side, this.point.getY() + this.side);
        points.add (nonOrientedThirdPoint.rotate(this.point, this.orientation));
        Point nonOrientedFourthPoint = new Point (this.point.getX() + this.side, this.point.getY());
        points.add (nonOrientedFourthPoint.rotate(this.point, this.orientation));
        return points;
    }
}
