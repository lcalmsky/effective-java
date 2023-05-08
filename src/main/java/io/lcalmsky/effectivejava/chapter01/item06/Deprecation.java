package io.lcalmsky.effectivejava.chapter01.item06;

public class Deprecation {

  private String name;

  // 애너테이션 프로세서

  /**
   * @deprecated in favor of {@link #Deprecation(String)}
   */
  @Deprecated(forRemoval = true, since = "1.2")
  public Deprecation() {
  }

  public Deprecation(String name) {
    this.name = name;
  }
}
