package decoratorPattern;

import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeComponent{
    protected EmployeeComponent employee;

    public EmployeeDecorator(EmployeeComponent employeeComponent) {
        this.employee = employeeComponent;
    }

    @Override
    public double getBasicSalary() {
        return employee.getBasicSalary();
    }
}
