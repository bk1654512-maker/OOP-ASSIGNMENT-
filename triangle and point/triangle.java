public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public Point getP3() {
        return this.p3;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public double perimeter() {
        double side1 = p1.distanceFrom(p2);
        double side2 = p2.distanceFrom(p3);
        double side3 = p3.distanceFrom(p1);

        return side1 + side2 + side3;
    }

    public double area() {
        double value = Math.abs(
                p1.getX() * (p2.getY() - p3.getY()) +
                p2.getX() * (p3.getY() - p1.getY()) +
                p3.getX() * (p1.getY() - p2.getY())
        );

        return value / 2;
    }

    public String type() {
        double side1 = p1.distanceFrom(p2);
        double side2 = p2.distanceFrom(p3);
        double side3 = p3.distanceFrom(p1);

        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public String toString() {
        return "Triangle[" + p1 + ", " + p2 + ", " + p3 + "]";
    }
}
