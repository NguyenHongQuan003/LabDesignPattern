package decoratorPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent {
    public double getBasicSalary();
    public void calcSalary();

    default void showBasicInformation() {
        System.out.println("Basic Salary: " + getBasicSalary() + " USD");
    }
}
