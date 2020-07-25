package pl.sda.javalon4.pdf.ex4;

import java.util.Arrays;

public class MovableRectangle implements Movable {

    private MovablePoint[] points = new MovablePoint[4];

    public MovableRectangle(MovablePoint a, MovablePoint b, MovablePoint c, MovablePoint d, int xSpeed, int ySpeed) {
        MovablePoint[] args = {a, b, c, d};
        validateRectangle(args);

        clonePointsArray(args);

        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovableRectangle(MovablePoint a, MovablePoint b, MovablePoint c, MovablePoint d) {
        MovablePoint[] args = {a, b, c, d};
        validateRectangle(args);

        clonePointsArray(args);

        setXSpeed(1);
        setYSpeed(1);
    }

    public MovableRectangle(MovablePoint[] points, int xSpeed, int ySpeed) {
        validateRectangle(points);

        clonePointsArray(points);

        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    private void validateRectangle(MovablePoint[] points) {
        boolean isRectangle = formsRectangle(points);
        if(!isRectangle)
            throw new IllegalArgumentException("Podane punkty nie tworza prostokata!");
        System.out.println("Punkty tworza prawidlowy prostokat");
    }

    /*
        A...B
        D...C

        Jak okreslic, ze punkty tworza prostokat:
        1. Obliczyc odleglosc poszczegolnych odcinkow tworzacych prostokat. Odcinki lezace na przeciwko siebie musza miec taka sama dlugosc.
        2. Obliczyc odleglosc punktow tworzacych przekatna prostokata np AC
        3. Sprawdzic, czy przekatna razem z bokami AD i DC tworzy trojkat wg wzoru pitagorasa:
            AC^2 = AD^2 + DC^2
     */
    private boolean formsRectangle(MovablePoint[] points) {
        boolean areOppositeSidesEqual = areOppositeSidesEqual(points);
        boolean diagonalCreatesTriangle = diagonalCreatesTriangle(points);

        return areOppositeSidesEqual && diagonalCreatesTriangle;
    }

    private boolean areOppositeSidesEqual(MovablePoint[] points) {
        double ab = points[0].distance(points[1]);
        double bc = points[1].distance(points[2]);
        double cd = points[2].distance(points[3]);
        double da = points[3].distance(points[0]);

        return ab == cd && bc == da;    //true lub false
    }

    private boolean diagonalCreatesTriangle(MovablePoint[] points) {
        double ac = points[2].distance(points[0]);

        double cd = points[2].distance(points[3]);
        double da = points[3].distance(points[0]);

        return 0 == Double.compare(Math.pow(ac, 2), Math.pow(cd, 2) + Math.pow(da, 2));
    }

    private void clonePointsArray(MovablePoint[] points) {
        try {
            for(int i = 0; i < 4; i++) {
                this.points[i] = (MovablePoint) points[i].clone();
            }
        }
        catch(CloneNotSupportedException ex) {
            System.err.println("Cannot perform cloning.");
        }
    }

    public void setXSpeed(int xSpeed) {
        for(MovablePoint mp : points)
            mp.setxSpeed(xSpeed);
    }

    public void setYSpeed(int ySpeed) {
        for(MovablePoint mp : points)
            mp.setySpeed(ySpeed);
    }

    @Override
    public void moveUp() {
        for(MovablePoint mp : points)
            mp.moveUp();
    }

    @Override
    public void moveDown() {
        for(MovablePoint mp : points)
            mp.moveDown();
    }

    @Override
    public void moveLeft() {
        for(MovablePoint mp : points)
            mp.moveLeft();
    }

    @Override
    public void moveRight() {
        for(MovablePoint mp : points)
            mp.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
