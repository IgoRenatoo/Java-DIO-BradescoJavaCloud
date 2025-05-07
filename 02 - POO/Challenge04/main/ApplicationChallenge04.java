/*
  Challenge 4: Gestão de Ingressos para Cinema
    Um sistema que gerencia a comercialização de ingressos de cinema, permitindo a criação de diferentes tipos de ingressos,
    cálculo de valores finais e definição de características específicas como descontos.

  Requisitos de Implementação:
    - Crie uma interface `MovieTicket` com os métodos `getPrice()`, `getMovieName()`, `isDubbed()` e
      `calculateFinalPrice()`.
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
package main;

import factory.TicketFactory;
import model.MovieTicket;
public class ApplicationChallenge04 {

  public static void main(String[] args) {
    MovieTicket ticket1 = TicketFactory.createTicket("standard", 20.0, "Matrix", false, 1);
    MovieTicket ticket2 = TicketFactory.createTicket("half", 20.0, "Toy Story", true, 1);
    MovieTicket ticket3 = TicketFactory.createTicket("family", 15.0, "Frozen", true, 4);

    printTicket(ticket1);
    printTicket(ticket2);
    printTicket(ticket3);
  }

  private static void printTicket(MovieTicket ticket) {
    System.out.println("Filme: " + ticket.getMovieName());
    System.out.println("Dublado: " + (ticket.isDubbed() ? "Sim" : "Não"));
    System.out.println("Preço final: R$ " + ticket.calculatePrice());
    System.out.println("-------------");
  }
}
