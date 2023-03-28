package io.lcalmsky.effectivejava.chapter01.item03.staticfactory;

public class MetaElvis<T>{

  private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

  private MetaElvis() {
  }

  @SuppressWarnings("unchecked")
  public static <T> MetaElvis<T> getInstance() {
    return (MetaElvis<T>) INSTANCE;
  }

  public void say(T t) {
    System.out.println(t);
  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, i'm outta here!");
  }
}
