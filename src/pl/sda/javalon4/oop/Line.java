package pl.sda.javalon4.oop;

public class Line {

    private Point2D begin, end;

    public Line() {};

    public Line(Point2D begin, Point2D end) {
        this.begin = begin;
        this.end = end;
    }

    public double calcLength() {
        return begin.distance(end);
    }

    @Override
    public String toString() {
        return String.format("Odcinek [begin = %s, end = %s]", begin.toString(), end.toString());
    }

    public Point2D getBegin() {
        return begin;
    }

    public void setBegin(Point2D begin) {
        this.begin = begin;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
}
