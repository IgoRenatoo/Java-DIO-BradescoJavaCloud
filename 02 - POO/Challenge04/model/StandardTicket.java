/*
  Challenge 4: Gestão de Ingressos para Cinema
    Um sistema que gerencia a comercialização de ingressos de cinema, permitindo a criação de diferentes tipos de ingressos,
    cálculo de valores finais e definição de características específicas como descontos.

  Requisitos de Implementação:
    - Crie uma interface `MovieTicket` com os métodos `getPrice()`, `getMovieName()`, `isDubbed()` e
      `calculatePrice()`.
    - Implemente a classe `StandardTicket`, que deve conter o valor base do ingresso, nome do filme e idioma (dublado ou
      legendado).
    - Crie as classes `HalfPriceTicket` e `FamilyTicket`, que estendem `StandardTicket` e implementam as seguintes regras:
        - `HalfPriceTicket`: o valor final do ingresso deve ser metade do valor informado na criação.
        - `FamilyTicket`: o valor final do ingresso deve ser multiplicado pelo número de pessoas e receber um desconto de 5%
          caso o número de pessoas seja maior que 3.
    - Implemente a classe `TicketFactory` com um méthodo estático
      `createTicket(String type, double price, String movieName, boolean isDubbed, int numPeople)`, que retorna o tipo de
      ingresso adequado.
*/
package model;

public class StandardTicket implements MovieTicket {
  protected double basePrice = 20;
  protected String movieName;
  protected boolean dubbed;

  public StandardTicket(double basePrice, String movieName, boolean dubbed) {
    this.basePrice = basePrice;
    this.movieName = movieName;
    this.dubbed = dubbed;
  }
  public double getPrice() {
    return basePrice;
  }

  @Override
  public String getMovieName() {
    return movieName;
  }

  @Override
  public boolean isDubbed() {
    return dubbed;
  }

  @Override
  public double calculatePrice() {
    return basePrice;
  }
}
