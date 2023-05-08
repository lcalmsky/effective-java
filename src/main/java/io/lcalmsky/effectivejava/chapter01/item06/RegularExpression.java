package io.lcalmsky.effectivejava.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern.matches("regex", "input");

        "a".split("regex");
        // 대안
        Pattern.compile("regex").split("a");
        // split은 한 character일 경우 빠름
        "a".split(",");
        "a".split(";");

        "a".replace("regex", "replacement");
        // 대안
        Pattern.compile("regex").matcher("a").replaceAll("replacement");
    }
}
