package CodeChallenge;

import java.util.Scanner;

public class DownloadVelocity {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar a entrada do usuário para a distância física e a velocidade do
    // plano de internet
    double distanciaServidores = scanner.nextDouble();

    double velocidadePlano = scanner.nextDouble();

    double velocidadeDownloadEstimada = calcularVelocidadeDownload(
        distanciaServidores, velocidadePlano);

    // Apresentar o resultado
    System.out.println("\nVelocidade de Download Estimada: "
        + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

    scanner.close();
  }

  public static double calcularVelocidadeDownload(double distanciaServidores,
      double velocidadePlano) {
    return velocidadePlano / (1 + (distanciaServidores / 100));
  }
}
