package collections.sets.sorting_operations.register_products;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
  private String name;
  private double price;
  private int quantity;
  private int code;

  public Product(String name, double price, int quantity, int code) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.code = code;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public int getCode() {
    return this.code;
  }

  public void increaseQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void decreaseQuantity(int quantity) {
    this.quantity -= quantity;
  }

  public double getTotalValueInStock() {
    return this.price * this.quantity;
  }

  @Override
  public int compareTo(Product other) {
    return this.name.toUpperCase().compareTo(other.getName().toUpperCase());
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (!(other instanceof Product product)) {
      return false;
    }

    return this.code == product.getCode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.code);
  }

  @Override
  public String toString() {
    return this.name + ", $" + String.format("%.2f", this.price) + ", "
        + this.quantity + " units, Total: $"
        + String.format("%.2f", this.getTotalValueInStock());
  }
}

class CompareProductByPrice implements Comparator<Product> {
  @Override
  public int compare(Product product1, Product product2) {
    return Double.compare(product1.getPrice(), product2.getPrice());
  }
}