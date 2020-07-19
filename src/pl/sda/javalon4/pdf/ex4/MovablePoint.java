package pl.sda.javalon4.pdf.ex4;

public class MovablePoint implements Movable, Cloneable {

    private int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }

    public double distance(MovablePoint mp) {
        return Math.sqrt(Math.pow(this.x - mp.x, 2) + Math.pow(this.y - mp.y, 2));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return String.format("MovablePoint: (%d, %d) [%d, %d]",
                    x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;    //y = y - ySpeed
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
