package io.lcalmsky.effectivejava.chapter01.item06;

public class Strings {

  public static void main(String[] args) {
    // 내부적으로 문자열을 pool에 캐싱중
    String hello = "hello";
    String hello2 = new String("hello"); // 강제로
    String hello3 = "hello";
    System.out.println(hello == hello2);
    System.out.println(hello.equals(hello2));
    System.out.println(hello == hello3);
    System.out.println(hello.equals(hello3));
  }
}
