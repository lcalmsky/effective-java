package io.lcalmsky.effectivejava.chapter01.item03.functionalinterface;

import java.time.LocalDate;

public class Person {

  LocalDate birthday;

  public Person(LocalDate birthday) {
    this.birthday = birthday;
  }

  public Person() {
  }

  public int getAge() {
    return LocalDate.now().getYear() - birthday.getYear();
  }

  public static int compareByAge(Person a, Person b) {
    return a.birthday.compareTo(b.birthday);
  }

  public int compareByAge2(Person b) {
    return this.birthday.compareTo(b.birthday);
  }

}
