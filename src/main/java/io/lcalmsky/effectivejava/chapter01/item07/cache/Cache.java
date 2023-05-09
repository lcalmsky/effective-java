package io.lcalmsky.effectivejava.chapter01.item07.cache;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Cache<T> {
    private final Map<String, WeakReference<T>> cacheMap;

    public Cache() {
        cacheMap = new HashMap<>();
    }

    public T get(String key) {
        T value = null;
        WeakReference<T> weakRef = cacheMap.get(key);
        if (weakRef != null) {
            value = weakRef.get();
            if (value == null) {
                cacheMap.remove(key); // 참조된 객체가 garbage collector에 의해 수집됨
            }
        }
        return value;
    }

    public void put(String key, T value) {
        cacheMap.put(key, new WeakReference<>(value));
    }

    public static void main(String[] args) {
        Map<String, String> weakHashMap = new WeakHashMap<>();
    }
}