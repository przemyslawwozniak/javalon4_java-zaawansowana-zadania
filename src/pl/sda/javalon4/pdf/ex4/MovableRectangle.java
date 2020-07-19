package pl.sda.javalon4.pdf.ex4;

import java.util.Arrays;

public class MovableRectangle implements Movable {

    private MovablePoint[] points = new MovablePoint[4];

    public MovableRectangle(MovablePoint a, MovablePoint b, MovablePoint c, MovablePoint d, int xSpeed, int ySpeed) {
        try {
            points[0] = (MovablePoint) a.clone();
            //points[0] = new MovablePoint(a.getX(), a.getY(), xSpeed, ySpeed); --- tworzenie nowej instancji klasy Point o tych samych parametrach
            points[1] = (MovablePoint) b.clone();
            points[2] = (MovablePoint) c.clone();
            points[3] = (MovablePoint) d.clone();
        }
        catch(CloneNotSupportedException ex) {
            System.err.println("Cannot perform cloning.");
        }

        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovableRectangle(MovablePoint[] points, int xSpeed, int ySpeed) {
        try {
            for(int i = 0; i < 4; i++) {
                points[i] = (MovablePoint) points[i].clone();
            }
        }
        catch(CloneNotSupportedException ex) {
            System.err.println("Cannot perform cloning.");
        }

        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
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
