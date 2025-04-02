package model;

public class Analyst extends Employee {
  private final double BONUS = 1.10;

  public Analyst(String name, double salary) {
    super(name, salary);
  }

  @Override
  public double calculateBonus() {
    super.calculateBonus();
    return super.salary * BONUS;
  }
}
