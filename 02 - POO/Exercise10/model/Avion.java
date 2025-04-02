package model;

public class Avion implements Transportation {
  @Override
  public void delivery() {
    System.out.println("Transporte de avião sendo iniciado..");
  }
}
