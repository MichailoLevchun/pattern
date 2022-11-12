package abstractFactory.model;

public class HourlyEmployee extends Employee{
    @Override
    double calculateSalary() {
        return getSalary() * getWorkingHoursPerDay() * getWorkingDaysPerMonth();
    }

    @Override
    public void deliverSalary() {
        System.out.printf("Return salary %s by Payoneer  account %n", calculateSalary());
    }

    public HourlyEmployee() {
        this.salary = 30;
        this.workingDaysPerMonth = 30;
        this.workingHoursPerDay = 8;
    }
}
