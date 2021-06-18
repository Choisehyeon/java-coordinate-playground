package locationcaculator;

public class Square extends Shape {

    Point p1,p2,p3,p4;
    int width = 0;
    int height = 0;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
        this.p3 = new Point(p3.getX(), p3.getY());
        this.p4 = new Point(p4.getX(), p4.getY());
    }

    @Override
    public double area() {
        width = length(p1.getX(), p2.getX());
        height = length(p2.getY(), p3.getY());
        return width * height;
    }
}
