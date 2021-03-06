package pl.sda.javalon4.generics;

import java.util.Objects;

//< > - diamond operator
public class Pair<K, V> {   //K - key, V - value; T - type; T1, T2
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("A pair of %s and %s - %s, %s",
                key.getClass().getSimpleName(), value.getClass().getSimpleName(),
                key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) &&
                Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}

/*class Pair<Integer, String> {
    Integer key;
    String value;
}

class PairIntBook {
    Integer key;
    Book value;
}

class PairStrStr {
    String key;
    String value;
}*/
