package collections.maps.find_operations.product_storage;

public class Products {
  private String name;
  private double price;
  private int quantity;

  public Products(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
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

  public String toString() {
    return this.name + ": " + this.price + "€, " + this.quantity + " units";
  }
}
