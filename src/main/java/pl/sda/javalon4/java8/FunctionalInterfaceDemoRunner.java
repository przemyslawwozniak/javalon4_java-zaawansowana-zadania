package pl.sda.javalon4.java8;

import pl.sda.javalon4.generics.Auto;

import java.util.Arrays;
import java.util.function.Predicate;

public class FunctionalInterfaceDemoRunner {

    public static void main(String[] args) {
        Predicate<Auto> isGermanPremiumBrand = auto -> {
            String[] germanPremiumBrands = {"Mercedes-Benz", "BMW", "Audi"};
            boolean isPremiumBrand = Arrays.asList(germanPremiumBrands).contains(auto.getManufacturer());
            if(isPremiumBrand)
                System.out.println(auto.getManufacturer() + " jest niemiecka marka premium");
            else
                System.out.println(auto.getManufacturer() + " nie jest niemiecka marka premium");
            return isPremiumBrand;
        };

        Auto w211 = new Auto(240000, 186, "Mercedes-Benz", 260, 7.5);
        Auto bmws5 = new Auto(180000, 150, "BMW", 240, 9.5);
        Auto mazda5 = new Auto(120000, 190, "Mazda", 260, 7.0);

        isGermanPremiumBrand.test(w211);
        isGermanPremiumBrand.test(bmws5);
        isGermanPremiumBrand.test(mazda5);

        Predicate<Auto> isGermanPremiumBrandFromClass = new PremiumGermanBrandPredicate();
        isGermanPremiumBrandFromClass.test(w211);
        isGermanPremiumBrandFromClass.test(bmws5);
        isGermanPremiumBrandFromClass.test(mazda5);

        w211.evaluate(auto -> auto.getVmax() >= 240 && auto.getHp() > 180 && auto.getPrice() >= 200000);
    }

}
