package io.lcalmsky.effectivejava.chapter01.item03.serialization;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.StringJoiner;

public class Book implements Serializable {

  private String isbn;
  private String title;
  private String author;
  private LocalDate published;
  transient private int numberOfSold;

  public Book(String isbn, String title, String author, LocalDate published) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.published = published;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public LocalDate getPublished() {
    return published;
  }

  public int getNumberOfSold() {
    return numberOfSold;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPublished(LocalDate published) {
    this.published = published;
  }

  public void setNumberOfSold(int numberOfSold) {
    this.numberOfSold = numberOfSold;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
        .add("isbn='" + isbn + "'")
        .add("title='" + title + "'")
        .add("author='" + author + "'")
        .add("published=" + published)
        .add("numberOfSold=" + numberOfSold)
        .toString();
  }
}
