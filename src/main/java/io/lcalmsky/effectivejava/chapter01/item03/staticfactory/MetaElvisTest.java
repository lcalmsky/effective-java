package io.lcalmsky.effectivejava.chapter01.item03.staticfactory;

public class MetaElvisTest {

  public static void main(String[] args) {
    MetaElvis<String> elvis1 = MetaElvis.getInstance();
    MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
    elvis1.say("hello");
    elvis2.say(100);
    System.out.println(elvis1);
    System.out.println(elvis2);
  }

}
