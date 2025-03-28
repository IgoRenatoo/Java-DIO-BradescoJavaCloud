/*
 * 🚀 Desafio: Controle de Fluxo 🚀
 *
 * Neste desafio, vamos colocar em prática os conceitos de controle de fluxo, implementando a seguinte lógica:
 *
 * 📌 O sistema deve receber dois números inteiros como parâmetros via terminal.
 * 📌 Com base nesses números, o programa calculará a quantidade de interações necessárias e exibirá no console a sequência numérica correspondente.
 * 📌 Exemplo:
 *    - Entrada: 12 e 30
 *    - Saída: "Imprimindo o número 1", "Imprimindo o número 2", ..., até "Imprimindo o número 18".
 *
 * ⚠️ Regras:
 * ✅ Se o primeiro número for MENOR que o segundo, o programa executará um loop (for) para exibir os valores incrementados.
 * ❌ Se o primeiro número for MAIOR que o segundo, o sistema deve lançar a exceção personalizada `ParametrosInvalidosException` com a mensagem:
 *    "O segundo parâmetro deve ser maior que o primeiro".
 *
 * 📂 Estrutura do Projeto:
 * - Dentro do projeto, implemente a classe `Challenge01.java`, responsável pela lógica do programa.
 * - Crie a classe `ParametrosInvalidosException.java` para representar a exceção personalizada.
 */

import java.util.Scanner;

public class Challenge01 {
  public static void main(String[] Args) {
    Scanner number = new Scanner(System.in);

    try (number) {
      System.out.println("Informe o 1° número: ");
      int num1 = number.nextInt();
      System.out.println("Informe o 2° número: ");
      int num2 = number.nextInt();
      if (num1 >= num2) {
        throw new ParametrosInvalidosException("Error: O número 1 deve ser maior que o número 2...");
      }

      System.out.println("A sequência é: ");
      for (int i = 1; i <= (num2 - num1); i++) {
        System.out.println("Imprimindo o número " + i);
      }
    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    }
  }
}

class ParametrosInvalidosException extends Exception {
  public ParametrosInvalidosException(String message) {
    super(message);
  }
}
