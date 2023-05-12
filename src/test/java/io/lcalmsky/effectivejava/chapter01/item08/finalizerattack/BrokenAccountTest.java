package io.lcalmsky.effectivejava.chapter01.item08.finalizerattack;

import org.junit.jupiter.api.Test;

class BrokenAccountTest {

    @Test
    void 푸틴_계정() throws InterruptedException {
        Account account = null;
        try {
            account = new BrokenAccount("푸틴");
        } catch (Exception e) {
            System.out.println("예외 발생");
        }
        System.gc();
        Thread.sleep(3000L);
    }
}