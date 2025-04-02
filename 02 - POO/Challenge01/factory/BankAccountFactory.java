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

package factory;

import model.BankAccount;
import model.CheckingAccount;
import model.SavingsAccount;

public class BankAccountFactory {
  public static BankAccount createAccount(String type, double initialDeposit) {
    if (type.equals("1")) {
      return new CheckingAccount(initialDeposit);
    } else if (type.equals("2")) {
      return new SavingsAccount(initialDeposit);
    } else {
      throw new Error("Tipo de conta inválido!");
    }
  }
}
