package io.lcalmsky.effectivejava.chapter01.item03.field;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

// 역직렬화로 싱글턴 인스턴스를 여러 개 만들 수 있음
public class ElvisSerialization {

  public static void main(String[] args) {
    try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
      output.writeObject(Elvis.INSTANCE);
    } catch (IOException e) {
      e.printStackTrace();
    }
    try (ObjectInput input = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
      Elvis elvis3 = (Elvis) input.readObject();
      System.out.println(elvis3 == Elvis.INSTANCE);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
