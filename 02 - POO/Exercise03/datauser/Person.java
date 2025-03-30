/*
  *Exercício 3: Criando uma Classe com Relacionamento*
    Crie duas classes: Pessoa e Endereco.
    - A classe Endereco deve ter os atributos rua e cidade.
    - A classe Pessoa deve ter os atributos nome e endereco (do tipo Endereco).
    - Adicione métodos para definir e obter os valores.
    - No méthodo main, instancie um objeto Pessoa e associe um endereço a ele.

  ❓ *Perguntas Técnicas*
    1. Qual é a diferença entre associação e composição em POO?
      R ~> Associação: Uma classe usa outra, mas ambas podem existir separadamente.
           Exemplo: Pessoa tem um Endereco, mas pode mudar ou existir sem ele.
    2. Por que o atributo endereco não pode ser do tipo primitivo?
      R ~> Porque ele é um Objeto contendo 2 propriedades.
    3. Como a criação de objetos pode influenciar o consumo de memória?
      R ~> Associação: Objetos ocupam memória Heap. Muitos objetos podem causar alto consumo, vazamento e queda de desempenho.
           O Garbage Collector ajuda, mas boas práticas evitam desperdício.
*/
package datauser;

public class Person {
  private String name;
  private Address address;

  void addDataUser(String addName, Address newAddress){
    this.name = addName;
    this.address = newAddress;
  }

  public static void main(String[] args) {
    Address newAddress = new Address();
    Person newUser = new Person();

    newAddress.addNewAddress("Rua Dulci", "Vila Velha!");
    newUser.addDataUser("Igor", newAddress);
    System.out.println("Seu nome é: " + newUser.name + ", " + newUser.address.displayData());
  }
}
