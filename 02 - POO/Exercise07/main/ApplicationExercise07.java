/*
  Exercício 7: Criando uma Classe Singleton
    Crie uma classe ConfiguracaoSistema que utilize o padrão Singleton.
    - A classe deve ter um atributo versao e um méthodo getInstancia() para garantir que só haja uma instância.
    - No main, tente instanciar ConfiguracaoSistema mais de uma vez e verifique se todas as instâncias são iguais.

  ❓ Perguntas Técnicas
    1. O que é um Singleton e para que ele é utilizado?
      R ~> Padrão de desing que consiste em apenas uma instância. Controlar acesso e recursos utilizados na aplicação.
    2. Quais problemas podem surgir ao implementar um Singleton em aplicações concorrentes?
      R ~> Problemas de sincronização em aplicação com multi-threaded.
    3. Como podemos modificar o Singleton para torná-lo thread-safe?
      R ~> Uso de syncronized ou criação com enum.
*/
package main;

import model.SingletonTest;

public class ApplicationExercise07 {
  public static void main(String[] args) {
    SingletonTest singleton1 = SingletonTest.getInstance();
    SingletonTest singleton2 = SingletonTest.getInstance();

    singleton2.setVersion("2.0.0");
    singleton1.getVersion(); // Compartilham instância e a versão da aplicação por terem modificador Static...
  }
}
