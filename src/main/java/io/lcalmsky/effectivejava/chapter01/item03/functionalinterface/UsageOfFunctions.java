package io.lcalmsky.effectivejava.chapter01.item03.functionalinterface;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class UsageOfFunctions {

  public static void main(String[] args) {
    List<LocalDate> dates = List.of(LocalDate.of(1982, 7, 15),
        LocalDate.of(2011, 3, 2),
        LocalDate.of(2013, 1, 28));
    Predicate<LocalDate> localDatePredicate = d -> d.isBefore(LocalDate.of(2000, 1, 1));
    Function<LocalDate, Integer> getYear = LocalDate::getYear;
    List<Integer> before2000 = dates.stream()
        .filter(localDatePredicate)
        .map(getYear)
        .collect(Collectors.toList());
    System.out.println(before2000);
    Supplier<Person> personSupplier = Person::new;
    Function<LocalDate, Person> localDatePersonFunction = Person::new;
  }

}
