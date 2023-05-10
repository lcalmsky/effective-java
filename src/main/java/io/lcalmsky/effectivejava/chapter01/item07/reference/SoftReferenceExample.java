package io.lcalmsky.effectivejava.chapter01.item07.reference;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {
    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> softReference = new SoftReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);
        // 메모리 공간이 충분해서 없어지지 않음
        // 메모리가 꽉 차야 없어짐
        System.out.println(softReference.get());
    }
}
