package pl.sda.javalon4.generics;

import java.util.function.Predicate;

public class Auto implements Comparable<Auto> {

    private int price;
    private int hp;
    private String manufacturer;
    private int vmax;
    private double acceleration;

    public Auto(int price, int hp, String manufacturer, int vmax, double acceleration) {
        this.price = price;
        this.hp = hp;
        this.manufacturer = manufacturer;
        this.vmax = vmax;
        this.acceleration = acceleration;
    }

    //this - 5
    //auto - 4
    //> 0 - ten jest wiekszy
    @Override
    public int compareTo(Auto auto) {
        return this.price - auto.price;
    }

    public int getPrice() {
        return price;
    }

    public int getHp() {
        return hp;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getVmax() {
        return vmax;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public boolean evaluate(Predicate<Auto> predicate) {
        boolean testResult = predicate.test(this);
        System.out.println(testResult);
        return testResult;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "price=" + price +
                ", hp=" + hp +
                ", manufacturer='" + manufacturer + '\'' +
                ", vmax=" + vmax +
                ", acceleration=" + acceleration +
                '}';
    }
}
