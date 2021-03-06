package pl.sda.javalon4.oop;

import pl.sda.javalon4.pdf.ex3.Point2D;
import pl.sda.javalon4.pdf.ex4.Movable;
import pl.sda.javalon4.pdf.ex4.MovablePoint;
import pl.sda.javalon4.pdf.ex4.MovableRectangle;
import pl.sda.javalon4.pdf.ex5.Customer;
import pl.sda.javalon4.pdf.ex5.MemberType;
import pl.sda.javalon4.pdf.ex5.Visit;

public class OOPRunner {

    public static void main(String[] args) {
        Point2D p0 = new Point2D();
        Point2D p1 = new Point2D(2, 10);
        Point2D p2 = new Point2D(-10, 20);

        /*comparePoints(p0, p1);
        comparePoints(p0, p2);
        comparePoints(p1, p2);
        comparePoints(p2, p1);
        comparePoints(new Point(), p1);
        comparePoints(new Point(), p2);*/

        /*Line l1 = new Line(p1, p2);
        System.out.println(l1);
        System.out.println("Dlugosc linii: " + l1.calcLength());*/

        /*Rectangle r1 = new Rectangle(5, 10, "yellow");
        System.out.println(r1);

        Triangle t1 = new Triangle(5, 10, "green");
        System.out.println(t1);

        //poniewaz maja wspolnego rodzica to mozna zrobic to:
        Shape[] shapes = {r1, t1};
        for(Shape s : shapes)
            System.out.println(s);*/

        /*Point3D p3d0 = new Point3D();
        Point3D p3d1 = new Point3D(10, 15, 13);

        System.out.println(p3d1.distance(p3d0));
        System.out.println(p3d1.distanceOnPlane(p1));
        System.out.println(p3d1.distance(p1));*/

        /*MovablePoint mp = new MovablePoint(0, 0, 5, 5);
        move(mp);
        MovableCircle mc = new MovableCircle(mp, 10);
        mp.setxSpeed(2);
        mp.setySpeed(-3);
        move(mc);
        move(mp);

        MovablePoint mp2 = new MovablePoint(5, 5, 10,10);
        MovablePoint mp3 = new MovablePoint(10, 10, -1, -5);
        MovablePoint mp4 = new MovablePoint(100, 100, -5, -10);
        MovableRectangle mr = new MovableRectangle(mp, mp2, mp3, mp4, 5, 5);
        System.out.println(mr);
        mp2.setySpeed(-100);
        mp2.setxSpeed(-100);
        System.out.println(mr);*/

        /*Customer c1 = new Customer("Przemek");
        Customer c2 = new Customer("Oliwia", MemberType.PLATINUM);
        Customer c3 = new Customer("Emilia", MemberType.GOLD);

        Visit v1 = new Visit(c1, 0, 80);
        Visit v2 = new Visit(c2, 0, 50);
        Visit v3 = new Visit(c3, 200, 450);

        Visit[] visits = {v1, v2, v3};
        for(Visit v : visits)
            v.printRecipe();*/

        //rectangle test
        //A (-3,2) and B (4,2) and C (4,-3) and D (-3,-3)
        MovablePoint a = new MovablePoint(-3, 2);
        MovablePoint b = new MovablePoint(4, 2);
        MovablePoint c = new MovablePoint(4, -3);
        MovablePoint d = new MovablePoint(-3, -3);

        MovableRectangle mr = new MovableRectangle(a, b, c, d);

        MovablePoint mp = new MovablePoint(0, 0, 5, 5);
        MovablePoint mp2 = new MovablePoint(5, 5, 10,10);
        MovablePoint mp3 = new MovablePoint(10, 10, -1, -5);
        MovablePoint mp4 = new MovablePoint(100, 100, -5, -10);
        MovableRectangle mr2 = new MovableRectangle(mp, mp2, mp3, mp4, 5, 5);

    }

    public static void comparePoints(Point2D p1, Point2D p2) {
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Odleglosc miedzy tymi punktami wynosi: " + p1.distance(p2) + "\n");
    }

    public static void move(Movable m) {
        System.out.println(m);
        m.moveRight();
        m.moveUp();
        System.out.println(m); //5, 5
        m.moveDown();
        m.moveLeft();
        System.out.println(m); //0,0
    }

}
