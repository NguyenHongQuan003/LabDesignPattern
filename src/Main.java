import decoratorPattern.EmployeeComponent;
import decoratorPattern.EmployeeConcreteComponent;
import decoratorPattern.Manager;
import decoratorPattern.TeamLeader;
import noDesignPattern.*;
import statePattern.BankTransfer;
import statePattern.COD;
import statePattern.PaymentContext;

public class Main {
    public static void main(String[] args) {
//        No design pattern
//        Payment p = new Payment("123", "Bank Transfer");
//        System.out.println("=====================================");
//        State pattern
//        PaymentContext pc = new PaymentContext();
//        pc.setState(new COD());
//        pc.applyState();
//
//        pc.setState(new BankTransfer());
//        pc.applyState();

//        Decorator pattern
        System.out.println("\nNORMAL EMPLOYEE");
        EmployeeComponent employee = new EmployeeConcreteComponent(1000);
        employee.showBasicInformation();
        employee.calcSalary();

        System.out.println("\nTEAM LEADER"); // basic salary * 1.5 + 500
        EmployeeComponent teamLeader = new TeamLeader(employee, 500);
        employee.showBasicInformation();
        teamLeader.calcSalary();


        System.out.println("\nMANAGER"); // basic salary * 2 + 1000
        EmployeeComponent manager = new Manager(employee, 1000);
        manager.showBasicInformation();
        manager.calcSalary();


        System.out.println("\nTEAM LEADER AND MANAGER: "); // basic salary * 2 + 1200
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader, 1200);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.calcSalary();

    }
}