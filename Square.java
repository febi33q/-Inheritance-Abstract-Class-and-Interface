//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of:\n    " +
                super.toString();
    }


    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}
