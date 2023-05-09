package io.lcalmsky.effectivejava.chapter01.item07.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class PostRepositoryWithWeakHashMap {
    private final Map<CacheKey, Post> cache;

    public PostRepositoryWithWeakHashMap() {
        this.cache = new WeakHashMap<>();
    }

    public Post getPostById(Integer id) {
        CacheKey key = new CacheKey(id);
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        Post post = new Post();
        cache.put(key, post);
        return post;
    }

    public Map<CacheKey, Post> getCache() {
        return cache;
    }
}
