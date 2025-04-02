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

package main;

import java.util.Scanner;

import factory.BankAccountFactory;
import model.BankAccount;

public class ApplicationChallenge01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String typeAccount;
    double initialDeposit;

    do {
      System.out.println("Escolha o tipo de conta a ser criada: 1 - Conta Corrente, 2 - Conta Poupança: ");
      typeAccount = scanner.nextLine();
    } while (!typeAccount.equals("1") && !typeAccount.equals("2"));

    System.out.println("Depósito inicial: ");
    initialDeposit = scanner.nextDouble();

    // Chamando um méthodo estático createAccount da classe BankAccountFactory].
    // Por ser estático (static), ele pode ser chamado sem criar uma instância de BankAccountFactory.
    // O retorno desse méthodo é uma instância de BankAccount.
    BankAccount account = BankAccountFactory.createAccount(typeAccount, initialDeposit);
    account.withdrawMoney(23);

    System.out.println("Conta criada com sucesso!");
    account.checkBalance();
    scanner.close();
  }
}
