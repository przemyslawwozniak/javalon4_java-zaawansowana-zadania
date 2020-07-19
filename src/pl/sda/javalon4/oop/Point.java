package pl.sda.javalon4.oop;

public class Point {    //extends java.lang.Object
    private int x, y;   //=0

    public Point() {}   //domyslny konstruktor dostarczany przez Java jesli nie ma innego konstruktora w klasie

    public Point(int x, int y) {
        //this.x = x;
        setX(x);
        //this.y = y;
        setY(y);
    }

    //this bedzie mialo zastosowanie, bo mamy dodatkowy kontekst - w scope metody (jej argumenty) maja taka sama nazwe jak pola klasy
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public double distance(Point another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }

    public int[] getXY() {
        int[] tab = {this.x, this.y}; //inicjalizator statyczny tablicy
        return tab;
    }

    public void setXY(int x, int y) {
        //this.x = x;
        setX(x);
        //this. y = y;
        setY(y);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public int getX() {
        return x;
    }
    //setX is a single point of failure / single method responsible for setting x field
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
