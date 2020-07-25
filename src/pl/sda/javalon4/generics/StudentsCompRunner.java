package pl.sda.javalon4.generics;

import java.util.Arrays;
import java.util.Comparator;

public class StudentsCompRunner {

    public static void main(String[] args) {
        Student s1 = new Student("Markowski", 5, 4.25);
        Student s2 = new Student("Gawkowski", 5, 3.9);
        Student s3 = new Student("Piotrkowski", 3, 5.0);
        Student s4 = new Student("Berent", 2, 2.75);
        Student s5 = new Student("Wybiciak", 1, 6.0);

        Student[] students = {s1, s2, s3, s4, s5};
        System.out.println("Nasze studenciaki: ");
        System.out.println(Arrays.toString(students));

        System.out.println("Sort by natural order: ");
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("Sort by avg mark DESC: ");
        Arrays.sort(students, new StudentAvgMarkDescComparator());
        System.out.println(Arrays.toString(students));

        System.out.println("Sort by func: ");
        Arrays.sort(students, new StundentFuncComparator());
        System.out.println(Arrays.toString(students));
    }

    //zazwyczaj komparator sortuje rosnaco
    //ten ma sortowac malejco
    //'normlanie' >0 oznacza 'wiekszy' -> asc
    //dla desc bedzie na odwrot, czyli <0 oznacza w rzeczywistosic 'wiekszy'
    public static class StudentAvgMarkDescComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s2.getAvgMark(), s1.getAvgMark());
        }
    }

    public static class StundentFuncComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return calc(s1) - calc(s2);
        }

        private int calc(Student s) {
            return s.getLastName().length() + (int)(s.getYear() * s.getAvgMark());
        }
    }

}
