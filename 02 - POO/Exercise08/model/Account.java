/*
  Exercício 8: Criando um Sistema Bancário com Interfaces
    - Crie uma interface Account com os métodos sacar, depositar e verSaldo.
    - Crie as classes ContaCorrente e ContaPoupanca que implementam essa interface.
    - No main, instancie contas diferentes e execute operações.

  ❓ Perguntas Técnicas
    1. Qual a diferença entre classe abstrata e interface?
    2. Quando devemos usar uma interface em vez de uma classe abstrata?
    3. É possível que uma classe implemente múltiplas interfaces?
*/
package model;

public interface Account {
  void deposit(double value);
  String displayBalance();
}
