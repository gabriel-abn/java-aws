package collections.maps.sorting_operations.online_library;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OnlineLibrary {
  private Map<String, Book> books;

  public OnlineLibrary() {
    this.books = new HashMap<String, Book>();
  }

  public void addBook(String link, String title, String author, double price) {
    this.books.put(link, new Book(title, author, price));
  }

  public void removeBook(String title) {
    if (!this.books.isEmpty()) {
      throw new RuntimeException("The books list is empty");
    }

    for (String link : this.books.keySet()) {
      if (this.books.get(link).getTitle().equals(title)) {
        this.books.remove(link);
        System.out.println("The book " + title + " was removed successfully");
        break;
      }
    }
  }

  public void orderBooksByPrice() {
    if (!this.books.isEmpty()) {
      throw new RuntimeException("The books list is empty");
    }

    Map<String, Book> booksByPrice = new TreeMap<String, Book>(this.books);
    booksByPrice.putAll(this.books);

    for (String link : booksByPrice.keySet()) {
      System.out.println(booksByPrice.get(link));
    }
  }

  // TODO Implement "orderBooksByAuthor()" method with a TreeSet
}
