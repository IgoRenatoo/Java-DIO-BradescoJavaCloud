package model;

public class Order {
  private final int orderNumber;
  private OrderStatus orderStatus;

  public Order(int orderNumber, OrderStatus initialStatus) {
    this.orderNumber = orderNumber;
    this.orderStatus = initialStatus;
  }

  public void changeStatus(OrderStatus newStatus) {
    this.orderStatus = newStatus;
    System.out.println("O status do pedido #" + orderNumber + " foi alterado para: " + newStatus.getStatus());
  }

  public void displayStatus() {
    System.out.println("Status atual do pedido #" + orderNumber + ": " + orderStatus.getStatus());
  }
}

