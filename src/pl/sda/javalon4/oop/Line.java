package pl.sda.javalon4.oop;

public class Line {

    private Point begin, end;

    public Line() {};

    public Line(Point begin, Point end) {
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

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
}
