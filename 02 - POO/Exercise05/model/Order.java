/*
  Exercício 5: Criando um Enum
  Crie um enum chamado StatusPedido que tenha os valores PENDENTE, PROCESSANDO, ENVIADO e ENTREGUE.
  - Crie uma classe Pedido com os atributos numeroPedido e status (do tipo StatusPedido).
  - Crie um méthodo que permita alterar o status do pedido.
  - No main, crie um pedido e altere seu status em diferentes etapas.

  ❓ Perguntas Técnicas
  1. O que é um enum e por que é útil?
  2. Como comparar corretamente valores de um enum em Java?
  3. Podemos adicionar métodos dentro de um enum? Como seria útil?
*/
package OrderStatus;

public class Order {
  private double orderNumber;
  private OrderStatus orderStatus;

  public void changeStatus(String newStatus) {
    this.orderStatus.changeStatus(newStatus);
  }

  public static void main(String[] args) {
    Order aquisition = new Order();
    OrderStatus orderStatus = new OrderStatus();

    aquisition.orderNumber = 1;
    aquisition.orderStatus.changeStatus("PENDENTE");
  }
}
