package caching.lru;

import java.util.Map;

public class LRUImpl<T, V> implements LRUCache<T,V> {

    private Map<T, V> map;
    private int size;
    private int capacity;
    private Node prev;
    private Node next;

    public LRUImpl(int capacity) {
        this.capacity = capacity;
        this.size = 0;

        next = new Node();
        prev = new Node();


    }

    @Override
    public V get(T key) {
        return null;
    }

    @Override
    public void put(T key, V val) {

    }



}
