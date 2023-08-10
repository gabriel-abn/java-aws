package code_challenge;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VerifyingPassword {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String password = sc.nextLine();

    System.out.println(verifyPassword(password));

    sc.close();
  }

  public static String verifyPassword(String password) {
    int minLen = 8;

    boolean temLetraMaiuscula = Pattern.compile("[A-Z]")
        .matcher(password)
        .find();

    boolean temLetraMinuscula = Pattern.compile("[a-z]")
        .matcher(password)
        .find();

    boolean temNumero = Pattern.compile("\\d").matcher(password).find();

    boolean temCaractereEspecial = Pattern.compile("\\W")
        .matcher(password)
        .find();

    boolean temSequenciaComum = password
        .matches(".*(?i)123456.*|.*(?i)abcdef.*");

    boolean temPalavraComum = password.equalsIgnoreCase("password")
        || password.equalsIgnoreCase("123456")
        || password.equalsIgnoreCase("qwerty");

    if (password.length() < minLen) {
      return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
    }

    if (temLetraMaiuscula && temLetraMinuscula && temNumero
        && temCaractereEspecial && !temSequenciaComum && !temPalavraComum) {
      return "Sua senha atende aos requisitos de seguranca. Parabens!";
    }

    return "Sua senha nao atende aos requisitos de seguranca.";
  }
}