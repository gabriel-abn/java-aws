package Lists.SortingOperations.NumbersSorting;

import java.util.ArrayList;
import java.util.Collections;

public class NumbersSorting {
  ArrayList<Integer> numbers;

  public NumbersSorting() {
    this.numbers = new ArrayList<Integer>();
  }

  public void addNumber(int number) {
    this.numbers.add(number);
  }

  public void print() {
    for (int number : this.numbers) {
      System.out.println(number);
    }
  }

  public ArrayList<Integer> getNumbers() {
    return this.numbers;
  }

  public ArrayList<Integer> ascendentOrder() {
    ArrayList<Integer> ascendentOrder = new ArrayList<Integer>(this.numbers);

    if (this.numbers.isEmpty()) {
      throw new RuntimeException("The list is empty");
    }

    Collections.sort(ascendentOrder);

    return ascendentOrder;
  }

  public ArrayList<Integer> descendentOrder() {
    ArrayList<Integer> descendentOrder = this.ascendentOrder();

    descendentOrder.sort(Collections.reverseOrder());

    return descendentOrder;
  }

  public static void main(String[] args) {
    NumbersSorting numbersOrder = new NumbersSorting();

    numbersOrder.addNumber(5132);
    numbersOrder.addNumber(124);
    numbersOrder.addNumber(341);
    numbersOrder.addNumber(112);
    numbersOrder.addNumber(-31);

    numbersOrder.print();

    System.out.println("Ascendent order:");
    numbersOrder.ascendentOrder().forEach(System.out::println);

    System.out.println("Descendent order:");
    numbersOrder.descendentOrder().forEach(System.out::println);
  }
}
