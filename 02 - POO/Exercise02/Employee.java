/*
  *Exercício 2: Criando um Pacote e Utilizando-o*
    Crie uma classe Funcionario. A classe deve conter:
    - Atributos privados nome (String) e salario (double).
    - Métodos getters e setters.
    - Um construtor que receba nome e salario como parâmetros.
    - Um méthodo exibirDados() para imprimir os detalhes do funcionário.

  ❓ *Perguntas Técnicas*
    1. O que é um pacote em Java e por que devemos usá-los?
      R ~> Um pacote em Java é um agrupamento de classes e interfaces relacionadas, organizado em diretórios no sistema de arquivos.
    2. Como podemos importar e utilizar uma classe de outro pacote?
      R ~> package <nome do pacote> e import <nome da classe> e em seguida, podemos instanciar e usar a classe normalmente.
    3. Qual é a diferença entre importações absolutas e relativas em Java?
      R ~> Em Java, as importações são sempre absolutas, ou seja, usam o caminho completo do pacote. Diferente de algumas linguagens como Python, Java não permite importações relativas.
*/
public class Employee {
  private final String name;
  private double wage;

  public Employee(String name, double wage) { // Metodo construtor
    this.name = name;
    this.wage = wage;
  }
  public void changeWage(double newWage) { // Setter para Alterar salário salário
    this.wage = newWage;
  }
  public String displayName() { // Getter para exibir o nome de 'pessoa'
    return this.name;
  }
  public void displayData() { // Metodo para exibir dados do funcionário
    System.out.println("Nome: " + this.name + ", Salário: " + wage);
  }

  public static void main(String[] args) {
    Employee pessoa = new Employee("Igor", 2100);

    pessoa.displayData();
  }
}
