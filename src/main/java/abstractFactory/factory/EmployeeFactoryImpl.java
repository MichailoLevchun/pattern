package abstractFactory.factory;

import abstractFactory.model.ContactEmployee;
import abstractFactory.model.Employee;
import abstractFactory.model.EmployeeType;
import abstractFactory.model.HourlyEmployee;

import javax.naming.directory.NoSuchAttributeException;

public class EmployeeFactoryImpl implements EmployeeFactory {
    @Override
    public Employee makeEmployee(EmployeeType type) {
        switch (type) {
            case HOURLY -> {
                return new HourlyEmployee();
            }
            case CONTRACTOR -> {
                return new ContactEmployee();
            }
            default -> throw new RuntimeException("No such argument");

        }
    }
}
