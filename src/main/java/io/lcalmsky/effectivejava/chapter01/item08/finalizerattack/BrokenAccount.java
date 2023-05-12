package io.lcalmsky.effectivejava.chapter01.item08.finalizerattack;

import java.math.BigDecimal;

public class BrokenAccount extends Account {
    public BrokenAccount(String accountId) {
        super(accountId);
    }

    @Override
    protected void finalize() throws Throwable {
        this.transfer(BigDecimal.valueOf(10000000), "jaime");
    }
}
