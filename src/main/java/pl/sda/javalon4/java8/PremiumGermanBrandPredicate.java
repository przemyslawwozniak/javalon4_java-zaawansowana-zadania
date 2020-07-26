package pl.sda.javalon4.java8;

import pl.sda.javalon4.generics.Auto;

import java.util.Arrays;
import java.util.function.Predicate;

public class PremiumGermanBrandPredicate implements Predicate<Auto> {

    private static final String[] germanPremiumBrands = {"Mercedes-Benz", "BMW", "Audi"};;

    @Override
    public boolean test(Auto auto) {
        boolean isPremiumBrand = Arrays.asList(germanPremiumBrands).contains(auto.getManufacturer());
        if(isPremiumBrand)
            System.out.println(auto.getManufacturer() + " jest niemiecka marka premium");
        else
            System.out.println(auto.getManufacturer() + " nie jest niemiecka marka premium");
        return isPremiumBrand;
    }
}
