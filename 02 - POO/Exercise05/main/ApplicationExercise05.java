/*
  Exercício 5: Criando um Enum
  Crie um enum chamado StatusPedido que tenha os valores PENDENTE, PROCESSANDO, ENVIADO e ENTREGUE.
  - Crie uma classe Pedido com os atributos numeroPedido e status (do tipo StatusPedido).
  - Crie um méthodo que permita alterar o status do pedido.
  - No main, crie um pedido e altere seu status em diferentes etapas.

  ❓ Perguntas Técnicas
  1. O que é um enum e por que é útil?
    R ~> Anum seria um conjunto de objetos, úlil para reutilização em diversas partes do código.
  2. Como comparar corretamente valores de um enum em Java?
    R ~> Com uso do operador de comparação "=="
  3. Podemos adicionar métodos dentro de um enum? Como seria útil?
    R ~> Sim, para padronização e reutilização de lógica.
*/
package main;

import model.Order;
import model.OrderStatus;

public class ApplicationExercise05 {
  public static void main(String[] args) {
    Order registration = new Order(1, OrderStatus.PENDENTE);

    registration.displayStatus();
    registration.changeStatus(OrderStatus.PROCESSANDO);
    registration.changeStatus(OrderStatus.ENVIADO);
  }
}

