package model;

public class SavingsAccount implements BankAccount {
  private double balance;

  public SavingsAccount(double initialDeposit) {
    this.balance = initialDeposit;
  }

  @Override
  public void checkBalance() {
    System.out.println("Seu saldo atual é de: R$ " + balance);
  }

  @Override
  public void checkOverdraft() {
    System.out.println("Contas poupança não possuem cheque especial.");
  }

  @Override
  public void depositMoney(double value) {
    balance += value;
    System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + balance);
  }

  @Override
  public void withdrawMoney(double value) {
    if (balance >= value) {
      balance -= value;
      System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + balance);
    } else {
      System.out.println("Saldo insuficiente!");
    }
  }

  @Override
  public void payBill(double payment) {
    if (balance >= payment) {
      balance -= payment;
      System.out.println("Conta paga com sucesso, seu saldo é de: " + balance);
    } else {
      System.out.println("Saldo insuficiente!");
    }
  }

  @Override
  public void isUsingOverdraft() {
    System.out.println("Feature pendente desenvolvimento...");
  }
}
