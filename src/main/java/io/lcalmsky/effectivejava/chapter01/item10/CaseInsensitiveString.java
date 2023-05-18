package io.lcalmsky.effectivejava.chapter01.item10;

import java.util.List;
import java.util.Objects;

public class CaseInsensitiveString {
    private final String value;

    public CaseInsensitiveString(String value) {
        this.value = Objects.requireNonNull(value);
    }

    // 대칭성 위배
//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof CaseInsensitiveString caseInsensitiveString) {
//            return value.equalsIgnoreCase(caseInsensitiveString.value);
//        }
//        if (o instanceof String s) {
//            return s.equalsIgnoreCase(value);
//        }
//        return false;
//    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String polish = "polish";
        System.out.println(cis.equals(polish));
        System.out.println(polish.equals(cis));
        List<CaseInsensitiveString> list = List.of(cis);
        System.out.println(list.contains(polish));
    }

    // CaseInsensitiveString에 대해서만 지원해야 함
    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString cis && cis.value.equalsIgnoreCase(this.value);
    }
}
