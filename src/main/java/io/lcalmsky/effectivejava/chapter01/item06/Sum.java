package io.lcalmsky.effectivejava.chapter01.item06;

public class Sum {

  public static void main(String[] args) {
    long start = System.nanoTime();
    long x = sumBoxing();
    long end = System.nanoTime();
    System.out.println((end - start) / 1_000_000. + "ms.");
    System.out.println(x);

    start = System.nanoTime();
    x = sum();
    end = System.nanoTime();
    System.out.println((end - start) / 1_000_000. + "ms.");
    System.out.println(x);
  }

  private static long sumBoxing() {
    Long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum += i;
    }
    return sum;
  }

  private static long sum() {
    long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum += i;
    }
    return sum;
  }
}
