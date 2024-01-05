package AutoSchedule.src;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

class Employee {
    private String name;
    private float desiredHours;
    private HashMap<String, String> availability;
    private boolean isFOH;
    private boolean isBOH;
    private float rating;
    private float scheduledHours;
    private ArrayList<Date> daysOff;

    
    public static void main(String args[]) {
        
    }

    public Employee() {
        setName("John Doe");
        setDesiredHours(20.0f);
        setOpenAvail();
        setIsFOH(false);
        setIsBOH(false);
        setRating(0.0f);
        setScheduledHours(0.0f);
        setDaysOff(new ArrayList<Date>());
    }
    public Employee(String name, int desiredHours, HashMap<String, String> availabiliy, boolean isFOH, boolean isBOH, int rating, float scheduledHours, ArrayList<Date> daysOff) {
        setName(name);
        setDesiredHours(desiredHours);
        setAvailability(availabiliy);
        setIsFOH(isFOH);
        setIsBOH(isBOH);
        setRating(rating);
        setScheduledHours(scheduledHours);
        setDaysOff(daysOff);
    }

    public String getName() {
        return this.name;
    }

    public float getDesiredHours() {
        return this.desiredHours;
    }

    public HashMap<String, String> getAvailability() {
        return this.availability;
    }

    public boolean getIsFOH() {
        return this.isFOH;
    }

    public boolean getIsBOH() {
        return this.isBOH;
    }

    public float getRating() {
        return this.rating;
    }

    public float getScheduledHours() {
        return this.scheduledHours;
    }

    public ArrayList<Date> getDaysOff() {
        return this.daysOff;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDesiredHours(float desiredHours) {
        if (desiredHours > 0)
            this.desiredHours = desiredHours;
    }

    private void setAvailability(HashMap<String, String> availability) {
        this.availability = availability;
    }

    private void setIsFOH(boolean isFOH) {
        this.isFOH = isFOH;
    }

    private void setIsBOH(boolean isBOH) {
        this.isBOH = isBOH;
    }

    private void setRating(float rating) {
        this.rating = rating;
    }

    private void setScheduledHours(float scheduledHours) {
        this.scheduledHours = scheduledHours;
    }

    private void setDaysOff(ArrayList<Date> daysOff) {
        this.daysOff = daysOff;
    } 

    private void setOpenAvail() {
        HashMap<String, String> availability = new HashMap<String, String>();

        availability.put("Sunday", "0-24");
        availability.put("Monday", "0-24");
        availability.put("Tuesday", "0-24");
        availability.put("Wednesday", "0-24");
        availability.put("Thursday", "0-24");
        availability.put("Friday", "0-24");
        availability.put("Saturday", "0-24");

        setAvailability(availability);
    }
}