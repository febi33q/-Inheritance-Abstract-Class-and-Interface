//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Circlee extends Shape {
    private double radius;

    public Circlee() {
        this.radius = 1.0;
    }

    public Circlee(double radius) {
        this.radius = radius;
    }

    public Circlee(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.283185307179586 * this.radius;
    }

    public String toString() {
        double var10000 = this.radius;
        return "A Circle with radius=" + var10000 + ", which is a subclass of " + super.toString();
    }
}
