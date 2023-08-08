package lists.BasicOperations.ShoppingCart;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String nameAtStart, double priceAtStart, int quantityAtStart) {
    this.name = nameAtStart;
    this.price = priceAtStart;
    this.quantity = quantityAtStart;
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

  public void printProduct() {
    System.out.println(this.name + ", price " + this.price + ", quantity " + this.quantity);
  }
}
