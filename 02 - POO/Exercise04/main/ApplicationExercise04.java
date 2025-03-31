/*
  Exercício 4: Controle de Visibilidade
    Crie uma classe Banco com os atributos privados nome e saldo.
    - Crie um méthodo público depositar(double valor), que adiciona ao saldo.
    - Crie um méthodo público sacar(double valor), que subtrai do saldo apenas se houver saldo suficiente.
    - O saldo só pode ser acessado por meio do méthodo getSaldo().

  ❓ Perguntas Técnicas
    1. Qual a diferença entre os modificadores public, private e protected?
      R ~> public: O membro é acessível de qualquer lugar, dentro ou fora da classe.
           private: O membro só pode ser acessado dentro da própria classe.
           protected: O membro pode ser acessado dentro da própria classe, por classes no mesmo pacote e por classes filhas (heranças).
    2. Como garantir que ninguém modifique o saldo diretamente?
      R ~> Atributo com modificador Private e um metodo "Setter" para alteração.
    3. Se quisermos permitir que classes filhas acessem o saldo, qual modificador usar?
      R ~> Protected.
*/
package main;

import model.Bank;

public class ApplicationExercise04 {
  public static void main(String[] args) {
    Bank account = new Bank("Cliente 1", 1000.0);
    account.deposit(500);
    account.withdraw(300);
    System.out.println("Saldo atual: R$ " + account.getBalance());
  }
}
