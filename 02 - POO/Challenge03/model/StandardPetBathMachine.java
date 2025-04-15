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
package model;

public class StandardPetBathMachine implements PetBathMachine {
  private int nivel_water = 0;
  private int nivel_shampoo = 0;
  private int pet_in_machine = 0;

  @Override
  public void giveBath() {
    System.out.println("Banho iniciado!");
  }
  @Override
  public void refillWater() {
    if ( nivel_water < 100) {
      nivel_water = 100;
    } else {
      System.out.println("O nível de água já está no limite!");
    }
  }
  @Override
  public void refillShampoo() {
    if ( nivel_shampoo < 100) {
      nivel_shampoo = 100;
    } else {
      System.out.println("O nível de shampoo já está no limite!");
    }
  }
  @Override
  public void checkWaterLevel() {
    System.out.println("Atualmente o nível da água é: " + nivel_water);
  }
  @Override
  public void checkShampooLevel() {
    System.out.println("Atualmente o nível do shampoo é: " + nivel_shampoo);
  }
  @Override
  public void placePet() {
    if ( pet_in_machine != 1){
      pet_in_machine = 1;
      System.out.println("Pet adicionado na máquina!");
    } else {
      System.out.println("Já tem um pet na máquina, ação invalida!");
    }
  }
  @Override
  public void removePet() {
    if (pet_in_machine == 1){
      pet_in_machine = 0;
      System.out.println("Pet removido na máquina!");
    } else {
      System.out.println("Nenhum Pet na máquina!");
    }
  }
  @Override
  public void cleanMachine() {
    System.out.println("Higienização iniciada!");
  }
}
