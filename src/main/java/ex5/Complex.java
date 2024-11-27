package main.java.ex5;

public class Complex {
    private final double re;
    private final double im;

    public Complex () {
        this.re = 0;
        this.im = 0;
    }

    public Complex (double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex fromPolarForm (double abs, double phase) {
        double realPart = abs * Math.cos(phase);
        double imaginaryPart = abs * Math.sin(phase);
        return new Complex (realPart, imaginaryPart);
    }

    public double getRe () {
        return this.re;
    }

    public double getIm () {
        return im;
    }

    public double abs () {
        return Math.sqrt (Math.pow(this.re, 2) + Math.pow(this.im, 2));
    }

    public double phase () {
        if (this.re != 0) {
            double tmp = Math.atan (this.im / this.re);
            if (this.re < 0 && this.im >= 0)
                tmp += Math.PI;
            if (this.re < 0 && this.im < 0)
                tmp -= Math.PI;
            return tmp;
        } else {
            if (this.im < 0)
                return -Math.PI/2;
            return Math.PI/2;
        }
    }

    public Complex conjugate () {
        return new Complex (this.re, -this.im);
    }

    public Complex sum (Complex other) {
        return new Complex (this.re + other.getRe(), this.im + other.getIm());
    }

    public Complex diff (Complex other) {
        return new Complex (this.re - other.getRe(), this.im - other.getIm());
    }

    public Complex mult (Complex other) {
        double productRe = this.getRe() * other.getRe() - this.getIm() * other.getIm();
        double productIm = this.getRe() * other.getIm() + this.getIm() * other.getRe();
        return new Complex(productRe, productIm);
    }

    public boolean almostEquals (Complex other, double precision) {
        return (this.diff(other).abs() < precision);
    }

    @Override
    public String toString () {
        return "Complex number: (" + this.re + ", " + this.im + ")";
    }

    public static void main (String[] args) {
        Complex A = new Complex (0.0, 1.0);
        Complex B = Complex.fromPolarForm (1.0d, Math.PI / 2);
        System.out.println ("A = " + A.getRe() + " + i * (" + A.getIm() + ")");
        System.out.println ("B = " + B.getRe() + " + i * (" + B.getIm() + ")");
        System.out.print ("A e B sono uguali a meno di 0.01 ? ");
        System.out.println (A.almostEquals(B, 1e-2));
    }

}