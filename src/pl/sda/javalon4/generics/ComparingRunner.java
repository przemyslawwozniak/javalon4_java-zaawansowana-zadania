package pl.sda.javalon4.generics;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingRunner {

    public static void main(String[] args) {
        Auto w211 = new Auto(240000, 186, "Mercedes-Benz", 260, 7.5);
        Auto bmws5 = new Auto(180000, 150, "BMW", 240, 9.5);
        Auto mazda5 = new Auto(120000, 190, "Mazda", 260, 7.0);

        Auto[] autos = {w211, bmws5, mazda5};
        System.out.println(Arrays.toString(autos));

        System.out.println("Sort by natural order: ");
        Arrays.sort(autos);
        System.out.println(Arrays.toString(autos));

        //https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html -> Static Nested Classes
        /*sortAndPrint(autos, new AutoComparators.AutoAccComparator());
        sortAndPrint(autos, new AutoComparators.AutoHpComparator());
        sortAndPrint(autos, new AutoComparators.AutoManufacturerComparator());
        sortAndPrint(autos, new AutoComparators.AutoVmaxComparator());*/

        sortAndPrint(autos, AutoComparators.autoAccComparator);
        sortAndPrint(autos, AutoComparators.autoHpComparator);
        sortAndPrint(autos, AutoComparators.autoManufacturerComparator);
        sortAndPrint(autos, AutoComparators.autoVmaxComparator);

    }

    private static void sortAndPrint(Auto[] array, Comparator<Auto> comparator) {
        System.out.println("Sort with " + comparator.getClass().getSimpleName());
        Arrays.sort(array, comparator);
        System.out.println(Arrays.toString(array));
    }

}
