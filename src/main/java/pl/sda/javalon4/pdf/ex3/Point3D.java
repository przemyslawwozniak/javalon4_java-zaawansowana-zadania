package pl.sda.javalon4.pdf.ex3;

public class Point3D extends Point2D {
    private int z;  //=0

    public Point3D() {
        super();
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        setZ(z);
    }

    public double distance(int x, int y, int z) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) + Math.pow(z - this.z, 2));
    }

    @Override
    public double distance() {
        return distance(0, 0,0 );
    }

    public double distance(Point3D another) {
        return distance(another.x, another.y, another.z);
    }

    @Override
    public double distance(int x, int y) {
        throw new UnsupportedOperationException("Nie mozna liczyc odleglosci dwuwymiarowej dla punktu trojwymiarowego.");
    }

    @Override
    public double distance(Point2D point2D) {
        throw new UnsupportedOperationException("Nie mozna liczyc odleglosci dwuwymiarowej dla punktu trojwymiarowego.");
    }

    public double distanceOnPlane(int x, int y) {
        return super.distance(x ,y);
    }

    public double distanceOnPlane(Point2D point2D) {
        return super.distance(point2D.x, point2D.y);
    }

    public double distanceOnPlane() {
        return super.distance();
    }

    public int[] getXYZ() {
        int[] tab = {x, y, z};
        return tab;
    }

    public void setXYZ(int x, int y, int z) {
        setXY(x, y);
        setZ(z);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", x, y, z);
    }

    public void setZ(int z) {
        this.z = z;
    }
}
