/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPL;

/**
 *
 * @author hp
 */
class Complex {

    private final double real;   // the real part
    private final double imaginary;   // the imaginary part
    
    // create a new object with the given real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    

    // return a string representation of the invoking Complex object
    public String toString() {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary <  0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }
    
     // return abs/modulus/magnitude and angle/phase/argument
    public double abs()   { return Math.hypot(real, imaginary); }  // Math.sqrt(re*re + im*im)
    public double phase() { return Math.atan2(imaginary, real); }  // between -pi and pi
    
    // return a new Complex object whose value is (this + b)
    public Complex plus(Complex b) {
        Complex complex = this;             // invoking object
        double real = complex.real + b.real;
        double imag = complex.imaginary + b.imaginary;
        return new Complex(real, imag);
    }
    
    // return a new Complex object whose value is (this - b)
    public Complex minus(Complex b) {
        Complex complex = this;
        double real = complex.real - b.real;
        double imag = complex.imaginary - b.imaginary;
        return new Complex(real, imag);
    }
    
    // return a new Complex object whose value is (this * b)
    public Complex times(Complex b) {
        Complex complex = this;
        double real = complex.real * b.real - complex.imaginary * b.imaginary;
        double imag = complex.real * b.imaginary + complex.imaginary * b.real;
        return new Complex(real, imag);
    }
    
    // scalar multiplication
    // return a new object whose value is (this * alpha)
    public Complex times(double alpha) {
        return new Complex(alpha * real, alpha * imaginary);
    }
    
    // return a new Complex object whose value is the conjugate of this
    public Complex conjugate() {  return new Complex(real, -imaginary); }
    
    public Complex reciprocal() {
        double scale = real*real + imaginary*imaginary;
        return new Complex(real / scale, -imaginary / scale);
    }
    
    // return the real or imaginary part
    public double real() { return real; }
    public double imaginary() { return imaginary; }
    
    // return a / b
    public Complex divides(Complex b) {
        Complex complex = this;
        return complex.times(b.reciprocal());
    }
    
     public Complex exp() {
        return new Complex(Math.exp(real) * Math.cos(imaginary), Math.exp(real) * Math.sin(imaginary));
    }
    
     
     // return a new Complex object whose value is the complex sine of this
    public Complex sin() {
        return new Complex(Math.sin(real) * Math.cosh(imaginary), Math.cos(real) * Math.sinh(imaginary));
    }
    
    public Complex cos() {
        return new Complex(Math.cos(real) * Math.cosh(imaginary), -Math.sin(real) * Math.sinh(imaginary));
    }
    
    // return a new Complex object whose value is the complex tangent of this
    public Complex tan() {
        return sin().divides(cos());
    }
    
    public static Complex plus(Complex realPart, Complex imaginaryPart) {
        double real = realPart.real + imaginaryPart.real;
        double imag = realPart.imaginary + imaginaryPart.imaginary;
        Complex sum = new Complex(real, imag);
        return sum;
    }
    
    public static void main(String[] args) {
        
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        System.out.println("a            = " + a);
        System.out.println("b            = " + b);
        System.out.println("Re(a)        = " + a.real());
        System.out.println("Im(a)        = " + a.imaginary());
        System.out.println("b + a        = " + b.plus(a));
        System.out.println("a - b        = " + a.minus(b));
        System.out.println("a * b        = " + a.times(b));
        System.out.println("b * a        = " + b.times(a));
        System.out.println("a / b        = " + a.divides(b));
        System.out.println("(a / b) * b  = " + a.divides(b).times(b));
        System.out.println("conj(a)      = " + a.conjugate());
        System.out.println("|a|          = " + a.abs());
        System.out.println("tan(a)       = " + a.tan());
        
    }
    
}
