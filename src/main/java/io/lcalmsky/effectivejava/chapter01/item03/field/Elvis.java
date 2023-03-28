package io.lcalmsky.effectivejava.chapter01.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

  public static final Elvis INSTANCE = new Elvis();
  // reflection을 통한 생성 방지용 플래그
  private static boolean CREATED;

  private Elvis() {
    // 역직렬화 테스트시에는 기본 생성자 사용
    if (CREATED) {
      throw new UnsupportedOperationException("can't be created by constructor");
    }
    CREATED = true;
  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, i'm outta here!");
  }

  public void sing() {
    System.out.println("I'll have a blue~ Crhistmas without you~");
  }

  // 역직렬화시 호출되는 메서드
  private Object readResolve() {
    return INSTANCE;
  }
}
