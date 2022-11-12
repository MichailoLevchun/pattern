package abstractFactory.model;

import lombok.Data;

@Data
public abstract class Employee {
    protected String name;
    protected int workingHoursPerDay;
    protected int workingDaysPerMonth;
    protected double salary;

    abstract double calculateSalary();
    public abstract void deliverSalary();
}
