package model;

public class Bank {
  private final String name;
  private double balance;

  public Bank(String name, double initialBalance) {
    this.name = name;
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Depósito de R$ " + amount + " realizado com sucesso.");
    } else {
      System.out.println("Valor inválido para depósito.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Saque de R$ " + amount + " realizado com sucesso.");
    } else {
      System.out.println("Saldo insuficiente ou valor inválido.");
    }
  }

  public double getBalance() {
    return balance;
  }

  public String getName() {
    return name;
  }
}
