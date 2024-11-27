package main.java.ex6;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;

public class BasicCanvas implements TwoDimensionalCanvas {
    private Point origin;
    private Point scale;
    private JFrame frame = new JFrame();
    private List<Shape> shapes = new LinkedList();
    private SimpleCanvas canvas = new SimpleCanvas();

    public BasicCanvas (int width, int height, Point origin, Point rectangle) {
        this.initUI (width, height);
        this.origin = new Point (origin.getX(), origin.getY());
        this.scale = new Point ((double)width / (rectangle.getX() - origin.getX()), (double)height / (rectangle.getY() - origin.getY()));
    }

    private double rasterX (Point p) {
        return (p.getX() - this.origin.getX()) * this.scale.getX();
    }

    private double rasterY (Point p) {
        return (p.getY() - this.origin.getY()) * this.scale.getY();
    }

    public void drawLine (Point firstEndPoint, Point secondEndPoint) {
        double x1 = this.rasterX (firstEndPoint);
        double y1 = this.rasterY (firstEndPoint);
        double x2 = this.rasterX (secondEndPoint);
        double y2 = this.rasterY (secondEndPoint);
        this.shapes.add (new Line2D.Double(x1, y1, x2, y2));
        this.canvas.repaint();
    }

    public void drawCircle (Point center, double radius) {
        Point firstEndPoint = new Point (center.getX() - radius, center.getY() - radius);
        System.out.println (radius);
        Point secondEndPoint = new Point (2.0 * radius, 2.0 * radius);
        double x1 = this.rasterX (firstEndPoint);
        double y1 = this.rasterY (firstEndPoint);
        double x2 = secondEndPoint.getX() * this.scale.getX();
        double y2 = secondEndPoint.getX() * this.scale.getY();
        this.shapes.add (new Ellipse2D.Double(x1, y1, x2, y2));
        this.canvas.repaint();
    }

    public void drawPoint (Point point) {
        double x1 = this.rasterX (point);
        double y1 = this.rasterY (point);
        this.shapes.add (new Ellipse2D.Double(x1 - 1.0, y1 - 1.0, 2.0, 2.0));
        this.canvas.repaint();
    }

    private void initUI (int width, int height) {
        this.frame.setTitle ("Canvas");
        this.frame.setDefaultCloseOperation (3);
        this.frame.add (this.canvas);
        this.frame.setSize (width, height);
        this.frame.setLocationRelativeTo ((Component)null);
        this.frame.setVisible (true);
    }

    private class SimpleCanvas extends Canvas {
        private static final long serialVersionUID = 3421617321270607155L;

        private SimpleCanvas () {
        }

        private void doDrawing (Graphics g) {
            Graphics2D graphics = (Graphics2D)g;
            Iterator var3 = BasicCanvas.this.shapes.iterator();

            while(var3.hasNext()) {
                Shape shape = (Shape)var3.next();
                graphics.draw (shape);
            }

        }

        public void paint (Graphics g) {
            super.paint (g);
            this.doDrawing (g);
        }
    }
}
