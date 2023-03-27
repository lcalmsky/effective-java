package io.lcalmsky.effectivejava.chapter01.item02.illegalargumentexception;

import java.time.LocalDate;

public class Order {

  public void updateDeliveryDate(LocalDate deliveryDate) {
    if (deliveryDate.isBefore(LocalDate.now())) {
      // 충분한 정보 전달
      throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
    }
  }

}
