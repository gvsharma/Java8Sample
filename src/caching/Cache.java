package caching;

public interface Cache<T, V> {
        V get(T key);
        void put(T key, V val);
}
