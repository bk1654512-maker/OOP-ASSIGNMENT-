public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
                real + other.real,
                imaginary + other.imaginary
        );
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(
                real - other.real,
                imaginary - other.imaginary
        );
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double r = (real * other.real) - (imaginary * other.imaginary);
        double i = (real * other.imaginary) + (imaginary * other.real);

        return new ComplexNumber(r, i);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
