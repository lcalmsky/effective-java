package io.lcalmsky.effectivejava.chapter01.item01;

public class Order {

  private boolean prime;
  private boolean urgent;
  private Product product;
  private OrderStatus orderStatus;

  public static Order primeOrder(Product product, boolean prime) {
    Order order = new Order();
    order.prime = true;
    order.product = product;
    return order;
  }

  public static Order urgentOrder(Product product, boolean prime) {
    Order order = new Order();
    order.urgent = true;
    order.product = product;
    return order;
  }
}
