package io.lcalmsky.effectivejava.chapter01.item07.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceExample {
    public static void main(String[] args) throws InterruptedException {
        BigObject strong = new BigObject();
        ReferenceQueue<BigObject> referenceQueue = new ReferenceQueue<>();
        BigObjectReference<BigObject> phantom = new BigObjectReference<>(strong, referenceQueue);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // 죽었지만 사라지지 않고 큐에 들어감(phantom = 유령)
        System.out.println(phantom.isEnqueued());
        Reference<? extends BigObject> reference = referenceQueue.poll();
        BigObjectReference<BigObject> bigObjectCleaner = (BigObjectReference<BigObject>) reference;
        bigObjectCleaner.cleanUp();
        reference.clear();
    }
}
