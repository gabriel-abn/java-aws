package collections.lists.find_operations.books_catalog;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
  private ArrayList<Book> books;

  public BooksCatalog() {
    books = new ArrayList<Book>();
  }

  public void add(Book book) {
    books.add(book);
  }

  public void print() {
    for (int i = 0; i < this.books.size(); i++) {
      System.out.println(books.get(i));
    }
  }

  public Book findByTitle(String title) {
    if (this.books.isEmpty()) {
      throw new IllegalStateException("The list is empty.");
    }

    for (Book book : this.books) {
      if (book.getTitle().equals(title)) {
        return book;
      }
    }

    throw new IllegalStateException("No book found.");
  }

  public List<Book> findByAuthor(String author) {
    ArrayList<Book> booksByAuthor = new ArrayList<Book>();

    for (int i = 0; i < this.books.size(); i++) {
      if (books.get(i).getAuthor().equals(author)) {
        booksByAuthor.add(books.get(i));
      }
    }

    if (booksByAuthor.isEmpty()) {
      throw new IllegalStateException("No book found with this author.");
    }

    return booksByAuthor;
  }

  public List<Book> findByYearsInterval(int startYear, int endYear) {
    ArrayList<Book> booksByYearsInterval = new ArrayList<Book>();

    if (startYear > endYear) {
      throw new IllegalStateException(
          "The start year must be less than the end year.");
    }

    if (this.books.isEmpty()) {
      throw new IllegalStateException("The list is empty.");
    }

    for (int i = 0; i < this.books.size(); i++) {
      if (books.get(i).getYear() >= startYear
          && books.get(i).getYear() <= endYear) {
        booksByYearsInterval.add(books.get(i));
      }
    }

    if (booksByYearsInterval.isEmpty()) {
      throw new IllegalStateException("No book found in this interval.");
    }

    return booksByYearsInterval;
  }

  public static void main(String[] args) {
    Book book1 = new Book("The Lord of the Rings", "Gabriel", 1954);
    Book book2 = new Book("The Hobbit", "J. R. R. Tolkien", 1937);
    Book book3 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien",
        1954);
    Book book4 = new Book("The Two Towers", "Gabriel", 1954);
    Book book5 = new Book("The Return of the King", "J. R. R. Tolkien", 1955);

    BooksCatalog catalog = new BooksCatalog();

    for (Book book : List.of(book1, book2, book3, book4, book5)) {
      catalog.add(book);
    }

    catalog.print();

    System.out.println(catalog.findByTitle("The Hobbit"));

    System.out.println(catalog.findByAuthor("Gabriel"));

    System.out.println(catalog.findByYearsInterval(1900, 1950));
  }
}
