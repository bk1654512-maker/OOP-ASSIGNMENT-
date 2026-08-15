public class Main {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(3, 5);
        ComplexNumber c2 = new ComplexNumber(2, 4);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        ComplexNumber sum = c1.add(c2);
        System.out.println("c1 + c2 = " + sum);

        ComplexNumber sub = c1.subtract(c2);
        System.out.println("c1 - c2 = " + sub);

        ComplexNumber mul = c1.multiply(c2);
        System.out.println("c1 * c2 = " + mul);

        ComplexNumber copy = new ComplexNumber(c1);
        System.out.println("Copy of c1 = " + copy);
    }
}
