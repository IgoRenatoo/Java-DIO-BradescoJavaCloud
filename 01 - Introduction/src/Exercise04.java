import java.util.Scanner;

/*
 * Recebe uma palavra e exibe-a invertida.
 */

public class Exercise04 {
  public static void main(String[] args) {
    Scanner word = new Scanner(System.in);

    System.out.println("Informe uma palavra com mais de 2 caracteres: ");
    String newWord = word.nextLine();

    if (newWord.length() <= 2){
      System.out.println("Quantidade de caracteres insuficiente...");
    } else {
      String inverseWord = new StringBuilder(newWord).reverse().toString();
      System.out.println(inverseWord);
    }
    word.close();
  }
}
