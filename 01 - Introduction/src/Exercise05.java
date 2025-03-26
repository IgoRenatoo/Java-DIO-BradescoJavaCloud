import java.util.Scanner;

/*
 * O programa verifica se um número inserido é primo.
 */

public class Exercise05 {
  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);

    System.out.println("Informe um número para verificar se ele é primo: ");
    int num = number.nextInt();
    int isCousin = 0;

    for (int i = 1; i <= num; i++) {
      if (num%i == 0) {
        isCousin++;
      }
    }
    if (isCousin == 2) {
      System.out.println("O número " + num + " é um número primo!");
    } else {
      System.out.println("O número " + num + " não é um número primo!");
    }
    number.close();
  }
}
