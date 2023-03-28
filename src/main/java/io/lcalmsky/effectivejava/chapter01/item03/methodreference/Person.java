package io.lcalmsky.effectivejava.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

  LocalDate birthday;

  public Person(LocalDate birthday) {
    this.birthday = birthday;
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

  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person(LocalDate.of(1982, 7, 15)));
    people.add(new Person(LocalDate.of(2011, 3, 2)));
    people.add(new Person(LocalDate.of(2013, 1, 28)));
    people.sort(Person::compareByAge);
    people.sort(Person::compareByAge2);
    List<LocalDate> dates = List.of(LocalDate.of(1982, 7, 15),
        LocalDate.of(2011, 3, 2),
        LocalDate.of(2013, 1, 28));
    List<Person> collect = dates.stream().map(Person::new).collect(Collectors.toList());
  }

}
