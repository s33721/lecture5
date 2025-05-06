public class B2BEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public B2BEmployee(String firstName, String lastName, String personalId,
                       double baseSalary, double hourlyRate, int hoursWorked) {
        super(firstName, lastName, personalId, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of the abstract method
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implementation of the method calculating vacation days
    @Override
    public int calculateVacationDays() {
        // B2B employees have vacation dependent on worked hours
        return hoursWorked / 40;  // 1 day of vacation for every 40h of work
    }
}