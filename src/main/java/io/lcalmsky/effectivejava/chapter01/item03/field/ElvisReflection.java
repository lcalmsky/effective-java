package io.lcalmsky.effectivejava.chapter01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {

  public static void main(String[] args) {
    try {
      Constructor<Elvis> defaultElvisConstructor = Elvis.class.getDeclaredConstructor();
      defaultElvisConstructor.setAccessible(true);
      Elvis.INSTANCE.sing();
      Elvis elvis1 = defaultElvisConstructor.newInstance();
      Elvis elvis2 = defaultElvisConstructor.newInstance();
      System.out.println(elvis1 == elvis2);
      System.out.println(elvis1 == Elvis.INSTANCE);
    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
      e.printStackTrace();
    }
  }

}
