package streams.functinal_interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemple {
  public static void main(String[] args) {
    // Usando uma função lambda, que retorna um inteiro aleatório. O método
    // implementado é o "get".
    Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);

    // Usando a interface Supplier
    List<Integer> list = Stream.generate(supplier).limit(5).toList();

    // Usando referência de método
    list.forEach(System.out::println);
  }
}
