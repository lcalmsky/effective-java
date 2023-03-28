package io.lcalmsky.effectivejava.chapter01.item03.field;

public class ElvisTest {
  public static void main(String[] args) {
    Elvis elvis = Elvis.INSTANCE;
    elvis.leaveTheBuilding();
    elvis.sing();
  }
}
