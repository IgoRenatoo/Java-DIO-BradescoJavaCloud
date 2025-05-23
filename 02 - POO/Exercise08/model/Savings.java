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

public class Savings implements Account {
  private String name;
  private int age;
  public double balance;

  public Savings(String name, int age, double balance) {
    this.name = name;
    this.age = age;
    this.balance = balance;
  }

  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  @Override
  public String displayBalance() {
    return "Seu saldo atual é de " + this.balance + " reais.";
  }
  @Override
  public void deposit(double value) {
    this.balance += value;
  }
}
