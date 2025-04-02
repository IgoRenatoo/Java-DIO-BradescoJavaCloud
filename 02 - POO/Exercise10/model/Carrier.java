package model;

public class Carrier {
  public Transportation transport(String type) {
    return switch (type) {
      case "avião" -> new Avion();
      case "caminhão" -> new BigTruck();
      case "navio" -> new Boat();
      default -> throw new Error("Opção invalida, apenas avião, caminhão e navio.");
    };
  }
}
