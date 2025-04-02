/*
  Challenge 1: Conta Bancária Inteligente
    Uma conta bancária que permite realizar operações como consulta de saldo, cheque especial, depósitos,
    saques e pagamento de boletos. A conta possui um limite de cheque especial baseado no valor inicial
    depositado e cobra uma taxa ao ser utilizado.

  Requisitos de Implementação:
    - Crie uma interface `BankAccount` com os métodos `checkBalance()`, `checkOverdraft()`, `depositMoney()`,
      `withdrawMoney()`, `payBill()` e `isUsingOverdraft()`.
    - Implemente as classes `CheckingAccount` e `SavingsAccount`, que implementam `BankAccount`.
    - Crie uma classe `BankAccountFactory` com um méthodo estático `createAccount(String type, double initialDeposit)`,
      que retorna o tipo de conta correto.
*/

package model;

public class CheckingAccount implements BankAccount {
  private double balance;

  public CheckingAccount(double initialDeposit) {
    this.balance = initialDeposit;
  }
  @Override
  public void checkBalance() {
    System.out.println("Seu saldo atual é de: " + balance);
  }
  @Override
  public void checkOverdraft() {
    System.out.println("Seu cheque-especial é de: " + (balance * 1.10));
  }
  @Override
  public void depositMoney(double value) {
    balance += value;
    System.out.println("Deposito relizado com sucesso, seu saldo é de: " + balance);
  }
  @Override
  public void withdrawMoney(double valueSake) {
    balance -= valueSake;
    System.out.println("Saque relizado com sucesso, seu saldo é de: " + balance);
  }
  @Override
  public void payBill(double payment) {
    balance -= payment;
    System.out.println("Conta paga com sucesso, seu saldo é de: " + balance);
  }
  @Override
  public void isUsingOverdraft() {
    System.out.println("Feature pendente desenvolvimento...");
  }
}
