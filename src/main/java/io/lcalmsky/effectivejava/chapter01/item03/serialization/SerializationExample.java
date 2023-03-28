package io.lcalmsky.effectivejava.chapter01.item03.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializationExample {

  private void serialize(Book book) {
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
      out.writeObject(book);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private Object deserialize() {
    try (ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))) {
      return in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    Book book = new Book("12345", "이펙티브 자바", "jaime", LocalDate.now());
    book.setNumberOfSold(200);

    SerializationExample example = new SerializationExample();
    example.serialize(book);
    Book deserializedBook = (Book) example.deserialize();
    System.out.println(book);
    System.out.println(deserializedBook);
  }

}
