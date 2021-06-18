package locationcaculator;

public class Triangle extends Shape {

    Point p1,p2,p3;
    Straight line1, line2, line3;
    double s;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
        this.p3 = new Point(p3.getX(), p3.getY());

    }

    @Override
    public double area() {
        line1 = new Straight(p1,p2);
        line2 = new Straight(p2,p3);
        line3 = new Straight(p1,p3);

        s = (line1.length() + line2.length()+line3.length()) / 2;
        return (Math.sqrt(s*(s- line1.length())*(s - line2.length())*(s-line3.length())));
    }

}
