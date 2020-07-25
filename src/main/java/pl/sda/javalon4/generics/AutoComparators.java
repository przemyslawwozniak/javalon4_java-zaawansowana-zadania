package pl.sda.javalon4.generics;

import java.util.Comparator;

public class AutoComparators {

    public static Comparator<Auto> autoHpComparator = new AutoHpComparator();
    public static Comparator<Auto> autoAccComparator = new AutoAccComparator();
    public static Comparator<Auto> autoVmaxComparator = new AutoVmaxComparator();
    public static Comparator<Auto> autoManufacturerComparator = new AutoManufacturerComparator();

    public static class AutoHpComparator implements Comparator<Auto> {
        @Override
        public int compare(Auto a1, Auto a2) {
            return a1.getHp() - a2.getHp();
        }
    }

    public static class AutoAccComparator implements Comparator<Auto> {
        @Override
        public int compare(Auto a1, Auto a2) {
            return Double.compare(a1.getAcceleration(), a2.getAcceleration());
        }
    }

    public static class AutoVmaxComparator implements Comparator<Auto> {
        @Override
        public int compare(Auto a1, Auto a2) {
            return a1.getVmax() - a2.getVmax();
        }
    }

    public static class AutoManufacturerComparator implements Comparator<Auto> {
        @Override
        public int compare(Auto a1, Auto a2) {
            return a1.getManufacturer().compareTo(a2.getManufacturer());
        }
    }

}
