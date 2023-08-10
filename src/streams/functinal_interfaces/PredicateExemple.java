package streams.functinal_interfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExemple {
  public static void main(String[] args) {
    List<Integer> list = Stream.generate(() -> (int) (Math.random() * 1000))
        .limit(10)
        .toList();

    // Usando uma função lambda para implementar o método "test" da interface
    // Predicate. O método "test" recebe um argumento e
    // retorna um valor booleano.
    // Para definir um Predicate, é necessário definir o tipo do argumento por
    // meio de generics.
    Predicate<Integer> predicate = (x) -> x % 2 == 0;

    List<Integer> list2 = list.stream()
        .filter(predicate)
        .toList();

    list2.forEach(System.out::println);

    // Usando uma função lambda.
    list.stream()
        .filter((x) -> x % 2 != 0)
        .forEach(System.out::println);
  }
}
