package decoratorPattern;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent{

    private double basicSalary;

    public EmployeeConcreteComponent(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public void calcSalary() {

    }
}
