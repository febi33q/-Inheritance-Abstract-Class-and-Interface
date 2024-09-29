public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // Override getArea() method to calculate surface area of the cylinder
    @Override
    public double getArea() {
        // Surface Area = 2πrh + 2 × base area
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // A public method for computing the volume of cylinder
    public double getVolume() {
        // Use super.getArea() to get the base area
        return super.getArea() * height; // Calculate volume using base area from Circle
    }
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }

}

