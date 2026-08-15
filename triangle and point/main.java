public class Main {

    public static void main(String[] args) {

        Point a = new Point(2.0, 3.0);
        Point b = new Point(4.0, 1.0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Point sum = a.add(b);
        System.out.println("sum = " + sum);

        Point diff = a.subtract(b);
        System.out.println("diff = " + diff);

        Point copy = new Point(a);
        System.out.println("copy of a = " + copy);

        a.setX(999.0);
        System.out.println("after copying, a is still: " + a);
        System.out.println("copy is now: " + copy);

        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(4.0, 0.0);
        Point p3 = new Point(0.0, 3.0);

        Triangle triangle = new Triangle(p1, p2, p3);

        System.out.println();
        System.out.println("Triangle: " + triangle);
        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Area: " + triangle.area());
        System.out.println("Type: " + triangle.type());
    }
}
