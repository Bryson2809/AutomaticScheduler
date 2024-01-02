class Employee {
    private String name;
    private float desiredHours;
    private String[] availability;
    private boolean isFOH;
    private boolean isBOH;
    private float rating;
    
    public static void main(String args[]) {
        
    }

    public Employee() {
        setName("John Doe");
        setDesiredHours(20);
        setOpenAvail();
    }
    public Employee(String name, int desiredHours, String[] availabiliy, boolean isFOH, boolean isBOH, int rating) {
        setName(name);
        setDesiredHours(desiredHours);
        setAvailability(availabiliy);
        setIsFOH(isFOH);
        setIsBOH(isBOH);
        setRating(rating);
    }

    public String getName() {
        return this.name;
    }

    public float getDesiredHours() {
        return this.desiredHours;
    }

    public String[] getAvailability() {
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

    private void setName(String name) {
        this.name = name;
    }

    private void setDesiredHours(float desiredHours) {
        if (desiredHours > 0)
            this.desiredHours = desiredHours;
    }

    private void setAvailability(String[] availability) {
        this.availability = availability;
    }

    private void setIsFOH(boolean isFOH) {
        this.isFOH = isFOH;
    }

    private void setIsBOH(boolean isBOH) {
        this.isBOH = isBOH;
    }

    private void setRating(int rating) {
        this.rating = rating;
    }

    private void setOpenAvail() {
        setAvailability(new String[]{"0-24", "0-24", "0-24", "0-24", "0-24", "0-24", "0-24"});
    }
}