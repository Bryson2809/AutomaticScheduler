package AutoSchedule.src;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.*;

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

    public void addEmployee(String name, int desiredHours, HashMap<String, String> availability, boolean isFOH, boolean isBOH, int rating, float scheduledHours, ArrayList<Date> daysOff) {
        employees.add(new Employee(name, desiredHours, availability, isFOH, isBOH, rating, scheduledHours, daysOff));
    }

    public void generateSchedule() {
        /**
         * Generate a schedule accounting for all employees availability, time off, desired hours, and labor productivity projections, while also creating the most efficient possible shift
         */
    }

    //TODO: Extract all employee info from JSON file to create employees in ArrayList (must be done after TODO in Employee.java is done) 
}
