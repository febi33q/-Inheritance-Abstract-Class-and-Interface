public class Shape {
    private String color;
    private boolean filled;

    // Konstruktor tanpa argumen
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Konstruktor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter untuk color
    public String getColor() {
        return color;
    }

    // Setter untuk color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk filled
    public boolean isFilled() {
        return filled;
    }

    // Setter untuk filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Metode toString
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }
}
