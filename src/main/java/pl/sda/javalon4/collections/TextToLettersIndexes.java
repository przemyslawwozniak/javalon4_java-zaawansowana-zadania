package pl.sda.javalon4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
1. Zdefiniowac napis do analizy:
String line = "Ala ma kota i Jarek tez ma kota."

2. Map<Character, Integer[]>
a = [2, 5, 10...]

3. String -> char[] ---> String.toCharArray()

4. W petli for lecimy po kazdym znaku

5. Dla kazdego znaku odczytujemy jego pozycje (index) w ciagu String i dodajemy do odpowiedniego klucza mapy - aktualizacja mapy poprzez modyfikacje (dodanie kolejnego indeksu) wartosci przypisanej do klucza (tablicy)
 */
public class TextToLettersIndexes {

    public static void main(String[] args) {
        String text = "Ala ma kota i Jarek też ma kota.";
        Map<Character, List<Integer>> lettersMap = new HashMap<>();
        char[] textChars = text.toCharArray();

        for(int i = 0; i < textChars.length; i++) {
            Character cObj = Character.valueOf(textChars[i]);
            if(lettersMap.containsKey(cObj)) {
                lettersMap.get(cObj).add(i);
            }
            else {
                List<Integer> idx = new ArrayList<>();
                idx.add(i);
                lettersMap.put(cObj, new ArrayList<>(idx));
            }
        }

        System.out.println(lettersMap);
    }

}
