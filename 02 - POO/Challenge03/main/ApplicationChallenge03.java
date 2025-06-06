/*
  Challenge 3: Gerenciamento de Banho de Petshop
    Um sistema que controla uma máquina de banho para pets, permitindo abastecimento de água e shampoo, verificação de
    níveis e regras específicas para entrada e saída dos animais, garantindo higiene adequada.

  Requisitos de Implementação:
    - Crie uma interface `PetBathMachine` com os métodos `giveBath()`, `refillWater()`, `refillShampoo()`,
      `checkWaterLevel()`, `checkShampooLevel()`, `placePet()`, `removePet()` e `cleanMachine()`.
    - Implemente a classe `StandardPetBathMachine`, que respeita as regras de uso de água e shampoo.
    - Crie uma classe `PetBathMachineFactory` com um méthodo estático `createMachine(String type)`, que retorna o tipo de
      máquina adequado.
*/
package main;

import model.PetBathMachine;
import model.StandardPetBathMachine;

public class ApplicationChallenge03 {
  public static void main(String[] args) {
    PetBathMachine machine = new StandardPetBathMachine();

    machine.checkShampooLevel();
    machine.checkWaterLevel();
    machine.refillShampoo();
    machine.checkShampooLevel();
  }
}
