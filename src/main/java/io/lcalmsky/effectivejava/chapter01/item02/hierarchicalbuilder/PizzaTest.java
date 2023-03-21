package io.lcalmsky.effectivejava.chapter01.item02.hierarchicalbuilder;

import io.lcalmsky.effectivejava.chapter01.item02.hierarchicalbuilder.NyPizza.Size;
import io.lcalmsky.effectivejava.chapter01.item02.hierarchicalbuilder.Pizza.Topping;

public class PizzaTest {

  public static void main(String[] args) {
    NyPizza nyPizza = new NyPizza.Builder(Size.SMALL)
        .addTopping(Topping.SAUSAGE)
        .addTopping(Topping.ONION)
        .build();
    Calzone calzone = new Calzone.Builder()
        .sauceInside()
        .addTopping(Topping.HAM)
        .build();
    System.out.println("nyPizza = " + nyPizza);
    System.out.println("calzone = " + calzone);
  }
}
