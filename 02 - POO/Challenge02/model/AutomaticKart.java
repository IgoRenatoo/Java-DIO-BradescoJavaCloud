package model;

public class AutomaticKart implements Kart {
  private int velocity;

  public AutomaticKart(int velocity) {
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
    System.out.println("Carro automatico, controle por conta do módulo!");
  }
}
