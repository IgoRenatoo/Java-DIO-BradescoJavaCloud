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

public class FamilyTicket extends StandardTicket {
  private int numPeople;

  public FamilyTicket(double basePrice, String movieName, boolean dubbed, int numPeople) {
    super(basePrice, movieName, dubbed);
    this.numPeople = numPeople;
  }

  @Override
  public double calculatePrice() {
    double total = basePrice * numPeople;
    if (numPeople > 3) {
      total *= 0.95; // desconto de 5%
    }
    return total;
  }
}
