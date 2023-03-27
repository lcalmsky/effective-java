package io.lcalmsky.effectivejava.chapter01.item02.freeze;

import java.util.ArrayList;
import java.util.List;

public class Person {

  private final String name;
  private final int birthYear;
  private final List<String> kids;

  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
    this.kids = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public List<String> getKids() {
    return kids;
  }

  public static void main(String[] args) {
    final Person person = new Person("jaime", 1988);
    person.getKids().add("bbang");
  }
}
