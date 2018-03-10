package pl.narodzinyprogramisty.Iterator;

import java.util.HashMap;
import java.util.Set;

public class ListWithId<V> {
    private static int id = 100;

    private HashMap<Integer, V> hashMap = new HashMap<>();

    public void add(V obj) {
        hashMap.put(someId(), obj);
    }

    private Integer someId() {
        return id++;
    }

    public V get(Integer key) {
        return hashMap.get(key);
    }

    public Set<Integer> getKey() {
        return hashMap.keySet();
    }


}
