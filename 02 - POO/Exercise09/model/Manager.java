package model;

public class Manager extends Employee {
  private final double BONUS = 1.40;

  public Manager(String name, double salary) {
    super(name, salary);
  }

  @Override
  public double calculateBonus() {
    super.calculateBonus();
    System.out.println(salary + " test " + super.salary);
    return super.salary * BONUS;
  }
}