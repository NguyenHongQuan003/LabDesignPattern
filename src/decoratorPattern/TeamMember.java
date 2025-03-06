package decoratorPattern;

public class TeamMember extends EmployeeDecorator{

    private double phuCap;

    public TeamMember(EmployeeComponent employeeComponent, double phuCap) {
        super(employeeComponent);
        this.phuCap = phuCap;
    }
    @Override
    public void calcSalary() {
        System.out.println("Calculating salary for member.");
        System.out.println("Manager's salary is: " + (employee.getBasicSalary() + phuCap));
    }
}
