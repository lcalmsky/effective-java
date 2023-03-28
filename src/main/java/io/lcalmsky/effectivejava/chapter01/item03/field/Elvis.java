package io.lcalmsky.effectivejava.chapter01.item03.field;

public class Elvis implements IElvis {

  public static final Elvis INSTANCE = new Elvis();

  private Elvis() {

  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, i'm outta here!");
  }

  public void sing() {
    System.out.println("I'll have a blue~ Crhistmas without you~");
  }
}
