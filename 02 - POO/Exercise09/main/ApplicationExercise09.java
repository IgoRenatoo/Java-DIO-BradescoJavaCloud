/*
  Exercício 9: Aplicando Encapsulamento e Polimorfismo
    Crie uma classe Funcionario e duas subclasses Gerente e Analista.
    - A classe Funcionario deve ter atributos nome e salario.
    - Gerente e Analista devem sobrescrever um méthodo calcularBonus().
    - No main, crie uma lista de funcionários e imprima os bônus de cada um.

  ❓ Perguntas Técnicas
    1. O que é polimorfismo e como ele é aplicado em Java?
      R ~> Consiste em metodos herdados com possibilidade de alterar sua estrutura nas subclasses.
    2. Qual a diferença entre sobrescrita (@Override) e sobrecarga de métodos?
      R ~> Override seria desenvolver uma lógica em uma especie de molde da superclasse, sobrecarga seria atribuir um novo molde.
    3. Como a substituição de métodos pode ser útil em um sistema real?
      R ~> Ajuda na escalabilidade, legibilidade do código.
*/
package main;

import model.Analyst;
import model.Manager;

public class ApplicationExercise09 {
  public static void main(String[] args) {
    Manager gerente1 = new Manager("Igor", 1223);
    Analyst analista1 = new Analyst("Emily" , -874);

    System.out.println("Seu salário atual é: " + gerente1.calculateBonus());
    System.out.println("Seu salário atual é: " + analista1.calculateBonus());
  }
}
