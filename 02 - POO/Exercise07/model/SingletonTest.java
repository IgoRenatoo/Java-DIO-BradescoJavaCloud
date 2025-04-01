package model;

public class SingletonTest {
  private static SingletonTest instance; //Static ~> Permite que a instância seja compartilhada globalmente
  private static String version = "1.0.0";
  private SingletonTest(){} // Impede que novas instâncias sejam criadas fora da classe.

  public static SingletonTest getInstance() { // Méthodo estático que permite acesso à única instância da classe
    if (instance == null) {
      instance = new SingletonTest();
    }
    return instance;
  }

  public void setVersion(String newVersion) {
    version = newVersion;
  }
  public void getVersion() {
    System.out.println("Versão atual é: " + version);
  }
  public void showMessage() {
    System.out.println("Singleton funcionando!");
  }
}
