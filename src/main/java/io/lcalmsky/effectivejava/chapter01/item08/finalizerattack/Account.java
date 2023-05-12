package io.lcalmsky.effectivejava.chapter01.item08.finalizerattack;

import java.math.BigDecimal;

public class Account {
//public final class Account { // 가장 단순한 해결 방법, 상속이 필요한 경우엔 사용할 수 없음
    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;
        if ("푸틴".equals(accountId)) {
            throw new IllegalArgumentException("푸틴은 계정을 막습니다.");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.printf("transfer %f from %s to %s\n", amount, accountId, to);
    }

//    @Override
//    protected final void finalize() throws Throwable { // 상속은 가능해도 메서드를 제정의 할 수 없음
//
//    }
}
