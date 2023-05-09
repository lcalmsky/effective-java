package io.lcalmsky.effectivejava.chapter01.item07.cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryTest {

    @Test
    void cache() throws InterruptedException {
        PostRepository postRepository = new PostRepository();
        Integer p1 = 1;
        Post postById = postRepository.getPostById(p1);
        assertFalse(postRepository.getCache().isEmpty());
        p1 = null;
        System.out.println("run gc");
        System.gc();
        System.out.println("wait");
        Thread.sleep(3000L);
        assertFalse(postRepository.getCache().isEmpty());
    }

    @Test
    void cacheWithWeakHashMap() throws InterruptedException {
        PostRepositoryWithWeakHashMap postRepository = new PostRepositoryWithWeakHashMap();
        Integer p1 = 1;
        Post postById = postRepository.getPostById(p1);
        assertFalse(postRepository.getCache().isEmpty());
        p1 = null;
        System.out.println("run gc");
        System.gc();
        System.out.println("wait");
        Thread.sleep(3000L);
        assertTrue(postRepository.getCache().isEmpty());
    }

}