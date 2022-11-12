package abstractFactory;

import abstractFactory.factory.EmployeeFactoryImpl;
import abstractFactory.model.EmployeeType;

import static abstractFactory.model.EmployeeType.CONTRACTOR;
import static abstractFactory.model.EmployeeType.HOURLY;

public class FactoryDemo {
    public void demo() {
        EmployeeFactoryImpl employeeFactory = new EmployeeFactoryImpl();

        employeeFactory.makeEmployee(HOURLY).deliverSalary();

        employeeFactory.makeEmployee(CONTRACTOR).deliverSalary();
    }
}
