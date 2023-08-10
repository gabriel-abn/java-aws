package streams.functinal_interfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionExemple {
  public static void main(String[] args) {
    List<Integer> list = Stream.generate(() -> (int) (Math.random() * 1000))
        .limit(5)
        .toList();

    Function<Integer, Integer> function = (x) -> x * 2;

    List<Integer> list2 = list.stream()
        .map(function)
        .toList();

    list2.forEach(System.out::println);

    // Usando uma função lambda para implementar o método "apply" da interface
    // Function. O método "apply" recebe um argumento e retorna um valor.
    // Para definir um Funtion, é necessário definir o tipo do argumento e o
    // tipo do valor de retorno por meio de generics.
    // Function<TipoArgumento, TipoRetorno>

    List<Integer> list3 = list.stream()
        .map((x) -> {
          System.out.println(x + " * 2: " + x * 2);
          return x * 2;
        })
        .toList();

    list3.forEach(System.out::println);
  }
}
