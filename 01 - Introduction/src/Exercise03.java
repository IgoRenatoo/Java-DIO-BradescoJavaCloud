import java.util.Scanner;

/*
 * O usuário informa quantos números deseja somar e o programa exibe o total.
 */

public class Exercise03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números você deseja somar? ");
    int n = scanner.nextInt();
    int result = 0;

    for (int i = 1; i <= n; i++) {
      System.out.print("Digite o " + i + "º número: ");
      int numero = scanner.nextInt();
      result += numero;
    }

    System.out.println("A soma dos números informados é: " + result);
    scanner.close();
  }
}
