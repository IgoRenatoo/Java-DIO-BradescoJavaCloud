import java.util.Scanner;

/*
 * O programa gera um número aleatório e o usuário precisa adivinhar, recebendo dicas de maior ou menor.
 */

public class Exercise06 {
  public static void main(String[] Args) {
    Scanner number = new Scanner(System.in);
    int correctNumb = 33;
    int currentNumb = 0;

    while (currentNumb != correctNumb) {
      System.out.println("Informe um número de 1 a 100: ");
      currentNumb = number.nextInt();
      if (currentNumb > correctNumb) {
        System.out.println("O número correto é menor que " + currentNumb);
      } else {
        System.out.println("O número correto é maior que " + currentNumb);
      }
    }
    System.out.println("Parabéns, vc acertou o número correto!");
    number.close();
  }
}
