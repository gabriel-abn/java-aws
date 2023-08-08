package lists.basic_operations.shopping_cart;

import java.util.ArrayList;

public class ShoppingCart {
  private ArrayList<Product> products;

  public ShoppingCart() {
    this.products = new ArrayList<Product>();
  }

  public void addProduct(String name, double price, int quantity) {
    this.products.add(new Product(name, price, quantity));
  }

  public void removeProduct(Product product) {
    this.products.remove(product);
  }

  public double totalValue() {
    double total = 0;
    for (Product product : this.products) {
      total += product.getPrice() * product.getQuantity();
    }
    return total;
  }

  public void print() {
    for (Product product : this.products) {
      product.printProduct();
    }
  }

  public static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart();

    shoppingCart.addProduct("milk", 3.42, 10);
    shoppingCart.addProduct("eggs", 2.99, 20);
    shoppingCart.addProduct("bread", 1.99, 30);
    shoppingCart.addProduct("butter", 2.99, 40);
    shoppingCart.addProduct("cheese", 4.99, 50);

    shoppingCart.print();
    System.out.println("Total value: " + shoppingCart.totalValue());

    shoppingCart.removeProduct(shoppingCart.products.get(0));
    shoppingCart.removeProduct(shoppingCart.products.get(0));

    shoppingCart.print();

    System.out.println("Total value: " + shoppingCart.totalValue());

  }
}
