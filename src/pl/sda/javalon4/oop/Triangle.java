package pl.sda.javalon4.oop;

public class Triangle extends Shape {
    private int a, h;

    public Triangle(int a, int h, String color) {
        super(color);
        this.a = a;
        this.h = h;
    }

    @Override
    public double calcArea() {
        return 0.5 * a * h;
    }

    @Override
    public String toString() {
        return String.format("To jest trojkat o podstawie %d i wysokosci %d - jego pole wynosi %.2f. %s",
                a, h, calcArea(), super.toString());
    }
}
