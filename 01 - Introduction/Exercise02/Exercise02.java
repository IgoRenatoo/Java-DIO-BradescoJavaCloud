import java.util.Scanner;

/**
 * Solicita um número ao usuário e exibe a tabuada de 1 a 10.
 */

public class Exercise02 {
  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);

    System.out.println("Informe um número de 1 a 100!");
    int num = number.nextInt();

    table(num);

    number.close();
  }

  public static void table(int num) {
    if (num < 100 && num > 0) {
      for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
      }
    } else {
      System.out.println("Número invalido!");
    }
  }
}
