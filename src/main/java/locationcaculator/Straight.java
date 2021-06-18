package locationcaculator;

public class Straight extends Shape {

    Point p1;
    Point p2;


    public Straight(Point p1, Point p2) {
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
    }

    public double length() {
        return Math.sqrt(Math.pow(length(p1.getX(),p2.getX()),2) + Math.pow(length(p1.getY(),p2.getY()),2));
    }

    @Override
    public double area() {
        return 0;
    }
}
