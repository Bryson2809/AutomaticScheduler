import java.util.ArrayList;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Schedule {
    private ArrayList<Employee> employees;

    public Schedule() {
        employees = new ArrayList<Employee>();
    }

    public Schedule(ArrayList<Employee> employees) {
        setEmployees(employees);
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    private void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(String name, int desiredHours, String[] availability, boolean isFOH, boolean isBOH, int rating, float scheduledHours, ArrayList<Date> daysOff) {
        employees.add(new Employee(name, desiredHours, availability, isFOH, isBOH, rating, scheduledHours, daysOff));
    }

    public void generateSchedule() {
        /**
         * Generate a schedule accounting for all employees availability, time off, desired hours, and labor productivity projections, while also creating the most efficient possible shift
         */
    }


}
