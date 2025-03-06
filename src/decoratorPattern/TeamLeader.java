package decoratorPattern;

public class TeamLeader extends EmployeeDecorator{

    private double phuCap;

    public TeamLeader(EmployeeComponent employeeComponent, double phuCap) {
        super(employeeComponent);
        this.phuCap = phuCap;
    }

    @Override
    public void calcSalary() {
        System.out.println("Calculating salary for teamLeader.");
        System.out.println("Manager's salary is: " + (employee.getBasicSalary() * 1.5 + phuCap));
    }
}
