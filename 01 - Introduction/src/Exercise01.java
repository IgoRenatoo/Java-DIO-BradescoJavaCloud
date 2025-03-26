import java.util.Scanner;

/**
 * Implementa operações matemáticas básicas (+, -, *, /) entre dois números
 * fornecidos pelo usuário.
 */

public class Exercise01 {
  public static void main(String[] args) throws Exception {
    System.out.println("Informe 2 número para ser realizado a soma!");

    Scanner numbers = new Scanner(System.in);

    System.out.println("Informe o 1° número inteiro!");
    int num1 = numbers.nextInt();

    System.out.println("Informe o 2° número inteiro!");
    int num2 = numbers.nextInt();

    int result = sum(num1, num2);
    System.out.println("A soma dos números são: " + result);

    numbers.close();
  };

  public static int sum(int num01, int num02) {
    return (num01 + num02);
  };
}
