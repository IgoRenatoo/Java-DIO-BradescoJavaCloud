/*
  *Exercício 3: Criando uma Classe com Relacionamento*
    Crie duas classes: Pessoa e Endereco.
    - A classe Endereco deve ter os atributos rua e cidade.
    - A classe Pessoa deve ter os atributos nome e endereco (do tipo Endereco).
    - Adicione métodos para definir e obter os valores.
    - No méthodo main, instancie um objeto Pessoa e associe um endereço a ele.

  ❓ *Perguntas Técnicas*
    1. Qual é a diferença entre associação e composição em POO?
    2. Por que o atributo endereco não pode ser do tipo primitivo?
    3. Como a criação de objetos pode influenciar o consumo de memória?
*/
package DataUser;

public class Address {
  private String road;
  private String city;

  void addAddress(String addRoad, String addCity){
    this.road = addRoad;
    this.city = addCity;
  }

  void changeRoad(String newRoad){
    this.road = newRoad;
  }
  void changeCity(String newCity){
    this.city = newCity;
  }
  void displayData() {
    System.out.println("Sua rua é: " + this.road + ", sua cidade é: " + this.city);
  }
}
