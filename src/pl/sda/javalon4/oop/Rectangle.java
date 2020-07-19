package pl.sda.javalon4.oop;

public class Rectangle extends Shape {

    private int a, b;

    public Rectangle(int a, int b, String color) {
        super(color);   //w przypadku konstruktora odwolanie sie do konstruktora rodzica poprzez super musi byc uzyte jako pierwsze
        //this.color = color; --- pole color w Shape jest protected wiec mozna odniesc sie bezposrednio z poziomu dziecka
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.format("To jest kwadrat o wymiarach %d x %d - jego pole wynosi %f. %s",
                a, b, calcArea(), super.toString());
    }
}
