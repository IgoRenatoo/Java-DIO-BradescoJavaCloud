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

  ❓ Perguntas Técnicas
    1. Como funcionam os limites de cheque especial em sistemas bancários reais?
    2. Qual a melhor maneira de implementar cobranças automáticas em uma aplicação bancária?
    3. Como podemos garantir que as regras de cheque especial sejam aplicadas corretamente no sistema?
*/

package model;

public interface BankAccount {
  void checkBalance();
  void checkOverdraft();
  void depositMoney(double value);
  void withdrawMoney(double valueSake);
  void payBill(double payment);
  void isUsingOverdraft();
}
