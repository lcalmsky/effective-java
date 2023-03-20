package io.lcalmsky.effectivejava.chapter01.item01;

public interface HelloService {

  String hello();

  static String hi() {
    prepareMessage();
    return "hi";
  }

  private static void prepareMessage() {

  }

  default String bye() {
    return "bye";
  }
}
