package abstractFactory.factory;

import abstractFactory.model.Employee;
import abstractFactory.model.EmployeeType;

public interface EmployeeFactory {

    Employee makeEmployee(EmployeeType type);
}
