package Map.SortingOperations.OnlineLibrary;

import java.util.Comparator;

public class Book implements Comparable<Book> {
  private String title;
  private String author;
  private double price;

  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public int compareTo(Book book) {
    if (this.price > book.getPrice()) {
      return 1;
    } else if (this.price < book.getPrice()) {
      return -1;
    }

    return 0;
  }

  @Override
  public String toString() {
    return this.title + " - " + this.author + ": " + this.price;
  }
}

class BooksByAuthorComparator implements Comparator<Book> {
  @Override
  public int compare(Book book1, Book book2) {
    return book1.getAuthor().compareToIgnoreCase(book2.getAuthor());
  }
}