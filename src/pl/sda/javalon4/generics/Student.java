package pl.sda.javalon4.generics;

public class Student {

    private String lastName;
    private int year;
    private double avgMark;

    public Student(String lastName, int year, double avgMark) {
        this.lastName = lastName;
        this.year = year;
        this.avgMark = avgMark;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public double getAvgMark() {
        return avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", year=" + year +
                ", avgMark=" + avgMark +
                '}';
    }
}
