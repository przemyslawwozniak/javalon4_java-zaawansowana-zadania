package pl.sda.javalon4.oop;

public class MovableCircle implements Movable {

    private MovablePoint center;
    private double r;

    public MovableCircle(MovablePoint center, double r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", r=" + r +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
