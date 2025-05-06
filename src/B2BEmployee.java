public class B2BEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public B2BEmployee(String firstName, String lastName, String personalId,
                       double baseSalary, double hourlyRate, int hoursWorked) {
        super(firstName, lastName, personalId, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
}