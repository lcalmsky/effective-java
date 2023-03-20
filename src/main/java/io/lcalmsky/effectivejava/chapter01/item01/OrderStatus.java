package io.lcalmsky.effectivejava.chapter01.item01;

public enum OrderStatus {
  PREPARING(100), SHIPPED(200), DELIVERING(300), DELIVERED(400);

  private final int number;

  OrderStatus(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }
}
