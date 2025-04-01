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
package main;

import model.Motorcycle;
import model.Vehicle;
import model.Car;
import model.Truck;

public class ApplicationExercise06 {
  public static void main(String[] args) {
    Car monza = new Car("Chevolet", 4, 4, "Alcool");
    Motorcycle harley = new Motorcycle("Harley Davidson", 2, "Gasolina");
    Truck scania = new Truck("Chevolet", 6, 2, "Alcool");

    monza.setTopSpeed(300);
    System.out.println("-----------------------");
    monza.displayData();
    System.out.println("-----------------------");
    harley.displayData();
    System.out.println("-----------------------");
    scania.displayData();
  }
}
