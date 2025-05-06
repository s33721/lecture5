public abstract class Employee {
    private String firstName;
    private String lastName;
    private String personalId;
    private double baseSalary;

    public Employee(String firstName, String lastName, String personalId, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.baseSalary = baseSalary;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalId() {
        return personalId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;

    }

    // Regular method with implementation
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Abstract method - each inheriting class must implement it
    public abstract double calculateSalary();

    // Abstract method for calculating vacation days
    public abstract int calculateVacationDays();
}

