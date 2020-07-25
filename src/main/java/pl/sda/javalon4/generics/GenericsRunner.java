package pl.sda.javalon4.generics;

import pl.sda.javalon4.pdf.ex2.Author;

public class GenericsRunner {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Vancouver");
        Pair<String, String> pair2 = new Pair<>("Bejing", "China");

        Author a1 = new Author("hs@gmail.com", "Henryk Sienkiewicz", 'm');
        Pair<Integer, Author> pair3 = new Pair<>(1, a1);

        Pair[] pairs = {pair1, pair2, pair3};
        for(Pair p : pairs)
            System.out.println(p);
    }

}
