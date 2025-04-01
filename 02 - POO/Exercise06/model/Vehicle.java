/*
  Exercício 6: Aplicando UML em um Projeto
    - Crie um diagrama de classes UML para representar um sistema de Veículos.
    - As classes devem incluir Carro, Moto e Caminhao, todas herdando da classe Veiculo.
    - A classe Veiculo deve ter atributos comuns e métodos abstratos.
    - Implemente o código Java baseado no diagrama.

  ❓ Perguntas Técnicas
    1. O que é UML e quais são seus principais diagramas?
      R ~> Representação gráfica de um sistema, podendo ser Diagrama de classes, diagrama de caso entre outros...
    2. O que significa herança em POO e como aplicamos isso no Java?
      R ~> Significa que uma classe (subclasse) pode herdar atributos e metodos da classe mãe (superclasse).
    3. Qual a importância de utilizar classes abstratas nesse contexto?
      R ~> A padronização dos recursos entre as subclasses, pois cada uma faz sua modificação necessária sem fugir do escopo.
*/
package model;

public class Vehicle {
  protected String mark;
  protected int wheel;
  private int door;
  private String fuel;
  protected int topSpeed;

  public Vehicle(String mark, int wheel, int door, String fuel) {
    this.mark = mark;
    this.wheel = wheel;
    this.door = door;
    this.fuel = fuel;
  }
  public void setTopSpeed(int newTopSpeed) {
    this.topSpeed = newTopSpeed;
  }
  public void displayData() {
    System.out.println("A marca do veículo é: " + this.mark);
    System.out.println("Quantidade de rodas: " + this.wheel);
    System.out.println("Quantidade de portas: " + this.door);
    System.out.println("Tipo de combustível: " + this.fuel);
    System.out.println("Sua velocidade máxima é: " + this.topSpeed + "km/h");
  }
}
