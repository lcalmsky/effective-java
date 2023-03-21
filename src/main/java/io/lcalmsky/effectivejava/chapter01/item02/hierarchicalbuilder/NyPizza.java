package io.lcalmsky.effectivejava.chapter01.item02.hierarchicalbuilder;

import java.util.Objects;

public class NyPizza extends Pizza {

  public enum Size {SMALL, MEDIUM, LARGE}

  private final Size size;

  public static class Builder extends Pizza.Builder<Builder> {

    private final Size size;

    public Builder(Size size) {
      this.size = Objects.requireNonNull(size);
    }


    @Override
    public NyPizza build() {
      return new NyPizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  private NyPizza(Builder builder) {
    super(builder);
    this.size = builder.size;
  }

  @Override
  public String toString() {
    return String.format("%s로 토핑한 %s 사이즈 뉴욕피자", super.toppings, size);
  }
}
