package io.lcalmsky.effectivejava.chapter01.item08.finalizerattack;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {

    @Test
    void 일반_계정() {
        Account account = new Account("jaime");
        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

    @Test
    void 푸틴_계정() {
        assertThrows(IllegalArgumentException.class, () -> new Account("푸틴"));
    }

}