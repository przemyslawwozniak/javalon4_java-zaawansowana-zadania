package pl.sda.javalon4.generics;

import java.util.Arrays;

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
    }

}
