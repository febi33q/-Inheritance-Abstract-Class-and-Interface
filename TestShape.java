public class TestShape {
    public static void main(String[] args) {
        // Membuat objek Shape dan mencetak informasi awal
        Shape shape = new Shape();
        System.out.println(shape);

        // Mengubah warna dan filled status dari shape, lalu mencetak kembali
        shape.setColor("red");
        shape.setFilled(false);
        System.out.println(shape);

        // Membuat objek Circle dan mencetak informasinya
        Circlee circlee = new Circlee(5.0, "blue", true);
        System.out.println(circlee);
        System.out.printf("Area: %.2f\n", circlee.getArea());
        System.out.printf("Perimeter: %.2f\n", circlee.getPerimeter());

        // Membuat objek Rectangle dan mencetak informasinya
        Rectangle rectangle = new Rectangle(4.0, 6.0, "yellow", true);
        System.out.println(rectangle);
        System.out.printf("Area: %.2f\n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f\n", rectangle.getPerimeter());

        // Membuat objek Square dan mencetak informasinya
        Square square = new Square(3.0);
        System.out.println(square);
        System.out.printf("Area: %.2f\n", square.getArea());
        System.out.printf("Perimeter: %.2f\n", square.getPerimeter());

        // Mengubah lebar square, dan mencetak hasil setelah perubahan
        square.setWidth(5.0);
        System.out.println("Setelah mengatur lebar ke 5.0: " + square);
    }
}
