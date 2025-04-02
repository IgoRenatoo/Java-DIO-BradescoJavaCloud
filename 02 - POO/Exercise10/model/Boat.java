package model;

public class Boat implements Transportation {
  @Override
  public void delivery() {
    System.out.println("Transporte de barco sendo iniciado...");
  }
}
