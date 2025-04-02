/*
  Exercício 10: Criando uma Fábrica de Objetos (Factory Method)
    Implemente um padrão Factory Method para criar objetos de transporte.
    - Crie uma interface Transporte com um méthodo entregar().
    - Implemente as classes Caminhao, Navio e Aviao que implementam Transporte.
    - Crie uma classe TransporteFactory com um méthodo estático criarTransporte(String tipo).

  ❓ Perguntas Técnicas
    1. O que é o padrão Factory Method e como ele melhora a flexibilidade do código?
      R ~> É um design pattern que padroniza a criação de instâncias, ele flexibiliza por conta de suas classes serem criadas de forma abstrata.
    2. Por que usamos interfaces nesse padrão de projeto?
      R ~> Para criação de metodos padrões entre as classes, obrigando a sua implementação.
    3. Como garantir que a fábrica retorne o objeto correto sem precisar modificar a classe principal?
      R ~> Definindo um seletor interno dentro da classe de criação.
*/

package main;

import model.Carrier;
import model.Transportation;

public class ApplicationExercise10 {
  public static void main(String[] args) {
    Carrier newTransport = new Carrier();

    Transportation avion1 = newTransport.transport("avião");

    avion1.delivery();

  }
}
