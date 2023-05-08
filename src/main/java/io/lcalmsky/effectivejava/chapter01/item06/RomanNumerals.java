package io.lcalmsky.effectivejava.chapter01.item06;

import java.util.regex.Pattern;

public class RomanNumerals {

  // 값비싼 객체를 재사용해 성능 개선
  private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

  static boolean isRomanNumeralSlow(String s) {
    return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
  }

  static boolean isRomanNumeralFast(String s) {
    return ROMAN.matcher(s).matches();
  }

  public static void main(String[] args) {
    extracted(() -> isRomanNumeralSlow("MCMLXXVI"), "slow");
    extracted(() -> isRomanNumeralFast("MCMLXXVI"), "fast");
  }

  private static void extracted(Runnable runner, String log) {
    long start = System.nanoTime();
    for (int i = 0; i < 10; i++) {
      runner.run();
    }
    long end = System.nanoTime();
    System.out.println(log + ": " + (end - start));
  }
}
