package collections.maps.find_operations.product_storage;

import java.util.HashMap;

public class ProductStorage {
  private HashMap<Long, Products> products;

  public ProductStorage() {
    this.products = new HashMap<Long, Products>();
  }

  public void addProduct(Long id, String name, double price, int quantity) {
    this.products.put(id, new Products(name, price, quantity));
  }

  public void showProducts() {
    if (this.products.isEmpty()) {
      throw new RuntimeException("The products list is empty");
    }

    System.out.println("Products: ");
    for (Long id : this.products.keySet()) {
      System.out.println(id + ": " + this.products.get(id));
    }
  }

  public double getTotalProductsPrice() {
    if (this.products.isEmpty()) {
      throw new RuntimeException("The products list is empty");
    }

    double total = 0;
    for (Products product : this.products.values()) {
      total += product.getPrice();
    }

    return total;
  }

  public void getHigherPriceProduct() {
    if (this.products.isEmpty()) {
      throw new RuntimeException("The products list is empty");
    }

    Products higherPriceProduct = null;
    double higherPrice = Double.MIN_VALUE;

    for (Products product : this.products.values()) {
      if (product.getPrice() > higherPrice) {
        higherPrice = product.getPrice();
        higherPriceProduct = product;
      }
    }

    System.out.println("Higher price product: " + higherPriceProduct);
  }

  public void getLowerPriceProduct() {
    if (this.products.isEmpty()) {
      throw new RuntimeException("The products list is empty");
    }

    Products lowerPriceProduct = null;
    double lowerPrice = Double.MAX_VALUE;

    for (Products product : this.products.values()) {
      if (product.getPrice() < lowerPrice) {
        lowerPrice = product.getPrice();
        lowerPriceProduct = product;
      }
    }

    System.out.println("Lower price product: " + lowerPriceProduct);
  }

  public void getHigherQuantityProductWithTotalPrice() {
    if (this.products.isEmpty()) {
      throw new RuntimeException("The products list is empty");
    }

    Products higherQuantityProduct = null;
    int higherQuantity = Integer.MIN_VALUE;

    for (Products product : this.products.values()) {
      if (product.getQuantity() > higherQuantity) {
        higherQuantity = product.getQuantity();
        higherQuantityProduct = product;
      }
    }

    System.out.println("Higher quantity product: " + higherQuantityProduct);
    System.out.println("Total price: " + higherQuantityProduct.getPrice()
        * higherQuantityProduct.getQuantity());
  }
}
