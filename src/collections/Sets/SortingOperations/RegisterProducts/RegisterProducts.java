package collections.Sets.SortingOperations.RegisterProducts;

import java.util.HashSet;
import java.util.TreeSet;

public class RegisterProducts {
  private HashSet<Product> products;

  public RegisterProducts() {
    this.products = new HashSet<Product>();
  }

  public void addProduct(String name, double price, int quantity, int code) {
    this.products.add(new Product(name, price, quantity, code));
  }

  public void listProductsByName() {
    TreeSet<Product> productsByName = new TreeSet<Product>(this.products);

    if (productsByName.isEmpty()) {
      System.out.println("No products registered.");
      return;
    }

    for (Product product : productsByName) {
      System.out.println(product.getName());
    }
  }

  public void listProductsByPrice() {
    TreeSet<Product> productsByPrice = new TreeSet<Product>(new CompareProductByPrice());

    if (this.products.isEmpty()) {
      System.out.println("No products registered.");
      return;
    }

    productsByPrice.addAll(this.products);

    for (Product product : productsByPrice) {
      System.out.println(product);
    }
  }

  public static void main(String[] args) {
    RegisterProducts registerProducts = new RegisterProducts();

    registerProducts.addProduct("TV", 900.00, 10, 1);
    registerProducts.addProduct("Notebook", 1200.00, 10, 2);
    registerProducts.addProduct("Tablet", 450.00, 10, 3);

    registerProducts.listProductsByName();
    registerProducts.listProductsByPrice();
  }
}
