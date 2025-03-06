package decoratorPattern;

public class Manager extends EmployeeDecorator{

    private double phuCap;

    public Manager(EmployeeComponent employeeComponent, double phuCap) {
        super(employeeComponent);
        this.phuCap = phuCap;
    }

    @Override
    public void calcSalary() {
        System.out.println("Calculating salary for manager.");
        System.out.println("Manager's salary is: " + (employee.getBasicSalary() * 2 + phuCap));
    }
}
