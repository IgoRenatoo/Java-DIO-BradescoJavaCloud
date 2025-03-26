import java.util.Scanner;

/*
 * O programa simula um caixa eletrônico que informa a quantidade de cédulas necessárias para um determinado valor de saque.
 */

public class Exercise07 {
  public static void main(String[] Args) {
    Scanner value = new Scanner(System.in);

    System.out.println("Informe o Valor a ser sacado: ");
    int amountMoney = value.nextInt();
    int count = 0;
    int result = 0;
    int[] ballot = {100, 50, 20, 10, 5, 2, 1};

    do {
      if (amountMoney >= ballot[count]){
        result += amountMoney/ballot[count];
        amountMoney = amountMoney%ballot[count];;
        count++;
      } else {
        count++;
      }
    } while (amountMoney != 0);
    System.out.println("A quantidade de notas para o valor informado é: " + result);
    value.close();
  }
}
