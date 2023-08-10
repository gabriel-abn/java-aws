package code_challenge;

import java.util.Scanner;

public class DimensioningEKS {
  public static void main(String[] args) {
    // Definindo as regras básicas
    int podsPorNode = 10;
    int podsPorServidor = 4;

    // Criando um objeto Scanner para receber as entradas do usuário
    Scanner scanner = new Scanner(System.in);

    // Recebendo as informações do usuário
    int numeroTotalPods = scanner.nextInt();

    int numeroMinimoNodes = (float) numeroTotalPods / podsPorNode > 1
        ? (int) Math.ceil((float) numeroTotalPods / podsPorNode)
        : 1;

    int numeroMinimoServidores = (float) numeroTotalPods / podsPorServidor > 1
        ? (int) Math.ceil((float) numeroTotalPods / podsPorServidor)
        : 1;

    if (numeroMinimoNodes == 1) {
      System.out.println("1.Recomendamos usar um unico node");
    } else {
      System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);
    }

    if (numeroMinimoServidores == 1) {
      System.out.println("2.Recomendamos usar um unico servidor");
    } else {
      System.out.println("2.Numero minimo de servidores:"
          + numeroMinimoServidores);
    }

    // Fechando o Scanner
    scanner.close();
  }
}
