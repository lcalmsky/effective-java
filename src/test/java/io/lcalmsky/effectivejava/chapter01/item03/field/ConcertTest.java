package io.lcalmsky.effectivejava.chapter01.item03.field;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ConcertTest {

  @Test
  void perform() {
    Concert concert = new Concert(Elvis.INSTANCE);
    concert.perform();
    assertTrue(concert.isLightsOn());
    assertTrue(concert.isMainStateOpen());
  }

}