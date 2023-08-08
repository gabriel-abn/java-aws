package Lists.FindOperations.NumSum;

import java.util.ArrayList;

public class NumberSum {
  private ArrayList<Integer> numbers;

  public NumberSum(ArrayList<Integer> numbers) {
    this.numbers = numbers;
  }

  public void addNumber(int number) {
    this.numbers.add(number);
  }

  public ArrayList<Integer> getNumbers() {
    return this.numbers;
  }

  public int sumList() {
    int sum = 0;

    for (int i = 0; i < this.numbers.size(); i++) {
      sum += this.numbers.get(i);
    }

    return sum;
  }

  public int findGreatest() {
    int greatest = this.numbers.get(0);

    for (int i = 0; i < this.numbers.size(); i++) {
      if (this.numbers.get(i) > greatest) {
        greatest = this.numbers.get(i);
      }
    }

    return greatest;
  }

  public int findSmallest() {
    int smallest = this.numbers.get(0);

    for (int i = 0; i < this.numbers.size(); i++) {
      if (this.numbers.get(i) < smallest) {
        smallest = this.numbers.get(i);
      }
    }

    return smallest;
  }

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    NumberSum sum = new NumberSum(numbers);

    sum.addNumber(3);
    sum.addNumber(2);
    sum.addNumber(6);
    sum.addNumber(-1);

    System.out.println("The sum: " + sum.sumList());
    System.out.println("The greatest: " + sum.findGreatest());
    System.out.println("The smallest: " + sum.findSmallest());
  }
}
