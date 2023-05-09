package io.lcalmsky.effectivejava.chapter01.item07.cache;

import java.util.HashMap;
import java.util.Map;

public class PostRepository {
    private final Map<CacheKey, Post> cache;

    public PostRepository() {
        this.cache = new HashMap<>();
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
