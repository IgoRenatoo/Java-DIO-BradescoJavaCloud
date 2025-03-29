/*
  *Exercício 1: Criando uma Classe Simples*
    Crie uma classe chamada Produto que represente um produto em um sistema de vendas. A classe deve ter:
    - Atributos privados nome (String) e preco (double).
    - Métodos públicos para definir e obter os valores desses atributos (setNome, getNome, setPreco, getPreco).
    - Um méthodo exibirInformacoes() que imprime os dados do produto.

  ❓ *Perguntas Técnicas*
    1. O que acontece se os atributos da classe forem públicos? Eles podem ser acessados externamente da classe. 3
    2. Por que usamos getter e setter em vez de acessar os atributos diretamente? Para proteger manipulação de dados da classe. 4
    3. Como instanciar um objeto Produto e definir seus valores? A partir da palavra reservada "new". 4
*/

public class Product {
  private String name;
  private double price;

  public void setData(String newName, double newPrice) {
    this.name = newName;
    this.price = newPrice;
  }

  public String getName() {
    return name;
  }
  public double getPrice() {
    return price;
  }

  public void displayData() {
    System.out.println("Nome do produto: " + name);
    System.out.println("Preço do produto: R$" + price);
  }

  public static void main(String[] args) {
    Product product = new Product();
    product.setData("Camiseta", 39.99);

    product.displayData();
  }
}