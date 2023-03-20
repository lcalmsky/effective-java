package io.lcalmsky.effectivejava.chapter01.item01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(List.of(100, 20, 44, 3));
    Comparator<Integer> desc = ((o1, o2) -> o2 - o1);
    numbers.sort(desc.reversed());
  }
}
