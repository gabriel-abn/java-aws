package CodeChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LogsMonitoringAWS {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int quantidadeLogs = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer do scanner

    Map<String, Long> eventosPorServico = new HashMap<>();
    for (int i = 0; i < quantidadeLogs; i++) {
      String[] parts = scanner.nextLine().split(",");
      String servico = parts[1];

      eventosPorServico.put(servico,
          eventosPorServico.getOrDefault(servico, 0L) + 1);
    }

    System.out.println("Eventos por servico:");
    eventosPorServico.forEach((servico, quantidade) -> {
      System.out.println(servico + ":" + quantidade);
    });

    System.out.print("Maior:");
    eventosPorServico.entrySet().stream()
        .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
        .limit(1)
        .forEach((entry) -> {
          System.out.println(entry.getKey());
        });

    System.out.print("Menor:");
    eventosPorServico.entrySet().stream()
        .sorted((a, b) -> a.getValue().compareTo(b.getValue()))
        .limit(1)
        .forEach((entry) -> {
          System.out.println(entry.getKey());
        });

    scanner.close();
  }
}
