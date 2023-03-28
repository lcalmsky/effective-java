package io.lcalmsky.effectivejava.chapter01.item03.enumtype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class EnumElvisSerialization {

  public static void main(String[] args) {
    try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
      output.writeObject(io.lcalmsky.effectivejava.chapter01.item03.field.Elvis.INSTANCE);
    } catch (IOException e) {
      e.printStackTrace();
    }
    try (ObjectInput input = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
      io.lcalmsky.effectivejava.chapter01.item03.field.Elvis elvis3 = (io.lcalmsky.effectivejava.chapter01.item03.field.Elvis) input.readObject();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
