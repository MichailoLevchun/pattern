package abstractFactory.model;

public class ContactEmployee extends Employee {
    private static final Double SALARY_CONTRACTOR = 4000D;

    @Override
    double calculateSalary() {
        return getSalary();
    }

    @Override
    public void deliverSalary() {
        System.out.printf("Return salary %s by bank account %n", calculateSalary());
    }

    public ContactEmployee() {
       this.salary = SALARY_CONTRACTOR;
    }
}
