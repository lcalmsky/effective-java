package io.lcalmsky.effectivejava.chapter01.item07.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class WeakReferenceExample {
    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        WeakReference<Object> softReference = new WeakReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);
        // gc가 발생하면 거의 없어짐
        System.out.println(softReference.get());
    }
}
