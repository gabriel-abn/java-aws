package collections.streams.functinal_interfaces;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    // BinaryOperator é uma interface funcional que recebe dois argumentos do
    // mesmo tipo e retorna um valor do mesmo tipo.
    // O método "apply" recebe dois argumentos e retorna um valor do mesmo tipo.
    BinaryOperator<Integer> sum = (n1, n2) -> n1 + n2;

    Integer sumResult = numbers.stream().reduce(0, sum);

    System.out.println(sumResult);

    Integer factorial = numbers.stream().reduce(1, (n1, n2) -> n1 * n2);

    System.out.println(factorial);
  }
}
