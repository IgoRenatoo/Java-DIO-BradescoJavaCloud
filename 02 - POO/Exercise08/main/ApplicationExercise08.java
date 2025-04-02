/*
  Exercício 8: Criando um Sistema Bancário com Interfaces
    - Crie uma interface ContaBancaria com os métodos sacar, depositar e verSaldo.
    - Crie as classes ContaCorrente e ContaPoupanca que implementam essa interface.
    - No main, instancie contas diferentes e execute operações.

  ❓ Perguntas Técnicas
    1. Qual a diferença entre classe abstrata e interface?
    2. Quando devemos usar uma interface em vez de uma classe abstrata?
    3. É possível que uma classe implemente múltiplas interfaces?
*/
package main;

import model.Current;
import model.Savings;

public class ApplicationExercise08 {
  public static void main(String[] args) {
    Current user1 = new Current("Igor", 32, 1221);
    Savings user2 = new Savings("Emily", 23, -3800);

    user1.deposit(826);

    System.out.println("Ei, " + user1.getName() + ", " + user1.displayBalance());
    System.out.println("Ei, " + user2.getName() + ", " + user2.displayBalance());
  }
}
