public class TestCylinder { // save as "TestCylinder.java"
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder with default values
        Cylinder c1 = new Cylinder();
        System.out.println(c1
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getVolume() / c1.getHeight() // Calculate base area from volume
                + " volume=" + c1.getVolume());

        // Declare and allocate a new instance of cylinder specifying height
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getVolume() / c2.getHeight()
                + " volume=" + c2.getVolume());

        // Declare and allocate a new instance of cylinder specifying radius and height
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getVolume() / c3.getHeight()
                + " volume=" + c3.getVolume());
    }
}
