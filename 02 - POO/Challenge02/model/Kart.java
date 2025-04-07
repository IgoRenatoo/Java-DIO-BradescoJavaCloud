/*
  Challenge 2: Simulador de Funções do Carro
    Um sistema que gerencia as funções básicas de um carro, como ligar, desligar, acelerar, reduzir velocidade, trocar
    marchas e virar. As regras respeitam os limites de velocidade para cada marcha e garantem um funcionamento realista do
    veículo.

  Requisitos de Implementação:
    - Crie uma interface `Car` com os métodos `turnOn()`, `turnOff()`, `accelerate()`,
      `decelerate()`, `turn(direction)`, `checkSpeed()` e `changeGear(newGear)`.
    - Implemente a classe `ManualCar`, que respeita as regras de marchas e velocidade.
    - Crie uma classe `CarFactory` com um méthodo estático `createCar(String type)`,
      que retorna um carro conforme o tipo especificado.
*/
package model;

public interface Kart {
  void turnOn();
  void turnOff();
  void accelerate(int addVelocity);
  void decelerate(int subVelocity);
  void turn(int direction);
  void changeMarch(int addMarch);
}
