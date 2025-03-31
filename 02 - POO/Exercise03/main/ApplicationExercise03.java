/*
  Exercício 3: Criando uma Classe com Relacionamento
    Crie duas classes: Pessoa e Endereco.
    - A classe Endereco deve ter os atributos rua e cidade.
    - A classe Pessoa deve ter os atributos nome e endereco (do tipo Endereco).
    - Adicione métodos para definir e obter os valores.
    - No méthodo main, instancie um objeto Pessoa e associe um endereço a ele.

  ❓ Perguntas Técnicas
    1. Qual é a diferença entre associação e composição em POO?
      R ~> Associação é um relacionamento onde os objetos podem existir independentemente,
      enquanto composição implica que um objeto depende da existência de outro e é destruído junto com ele.
    2. Por que o atributo endereco não pode ser do tipo primitivo?
      R ~> Porque ele precisa ser do tipo String.
    3. Como a criação de objetos pode influenciar o consumo de memória?
      R ~> Pois os objetos são armazenados na memória, quanto mais objeto, mais consumo de memória.
 */
package main;

import model.Address;
import model.Person;

public class ApplicationExercise03 {
  public static void main(String[] args) {
    Address newAddress = new Address();
    Person newUser = new Person();

    newAddress.addNewAddress("Rua Dulci", "Vila Velha!");
    newUser.addDataUser("Igor", newAddress);
    System.out.println("Seu nome é: " + newUser.name + ", " + newUser.address.displayData());
  }
}
