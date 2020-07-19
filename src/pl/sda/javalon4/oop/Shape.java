package pl.sda.javalon4.oop;

public abstract class Shape {

    protected String color; //protected umozliwia odwolanie sie z poziomu dziecka

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public String toString() {
        return "Ten kształt ma kolor " + color + "\n";
    }

}
