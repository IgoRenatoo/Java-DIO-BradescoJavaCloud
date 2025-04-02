package model;

public class Employee {
  protected String name;
  protected double salary;

  protected Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  protected double calculateBonus(){
    return 0;
  }
}
