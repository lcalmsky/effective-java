package io.lcalmsky.effectivejava.chapter01.item03.enumtype;

import java.lang.reflect.Constructor;

public class EnumElvisReflection {

  public static void main(String[] args) throws NoSuchMethodException {
    Constructor<Elvis> constructor = Elvis.class.getDeclaredConstructor();
    System.out.println(constructor);
  }

}
