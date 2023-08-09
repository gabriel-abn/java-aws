package streams.functinalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("John Cage", "Freddy Krueger",
        "Samuel Francis",
        "John Snow", "Samuel Jackson");

    // Usando a interface Consumer
    Consumer<String> printSamuel = name -> {
      if (name.contains("Samuel")) {
        System.out.println("Hello " + name);
      }
    };

    names.stream().forEach(printSamuel);

    // Usando uma função lambda
    names.forEach(name -> {
      if (name.contains("John")) {
        System.out.println("Greatings " + name);
      }
    });

    names.stream()
        .filter(name -> name.contains("K"))
        .forEach(name -> System.out.println("Good morning " + name));

    // Usando o método accept
    names.stream().forEach(new Consumer<String>() {
      @Override
      public void accept(String name) {
        if (name.contains("Freddy")) {
          System.out.println("Welcome " + name);
        }
      }
    });
  }
}
