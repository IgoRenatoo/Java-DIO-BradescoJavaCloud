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

public class ManualKart implements Kart {
  private int velocity;
  private int march = 0;

  public ManualKart(int velocity) {
    this.velocity = velocity;
  }

  @Override
  public void turnOn() {
    System.out.println("Carro ligado!");
  }
  @Override
  public void turnOff() {
    System.out.println("Carro desligado!");
  }
  @Override
  public void accelerate(int addVelocity) {
    velocity += addVelocity;
    System.out.println("Você acelerou o veículo, em + " + addVelocity + "km/h");
  }
  @Override
  public void decelerate(int subVelocity) {
    velocity -= subVelocity;
    System.out.println("Você desacelerou o veículo, em + " + subVelocity + "km/h");
  }
  @Override
  public void turn(int direction) {
    System.out.println("Você acaba de virar a " + direction + "!");
  }
  @Override
  public void changeMarch(int addMarch) {
    if (addMarch == 1) {
      march++;
    } else {
      march--;
    }
    System.out.println("Você acaba de mudar de marcha, você está na " + march + " marcha!");
  }
}
