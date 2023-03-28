package io.lcalmsky.effectivejava.chapter01.item03.enumtype;

public enum Elvis {
  INSTANCE;

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, i'm outta here!");
  }

  public void sing() {
    System.out.println("I'll have a blue~ Crhistmas without you~");
  }
}
