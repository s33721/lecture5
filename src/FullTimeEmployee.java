public class FullTimeEmployee extends Employee {
    private int yearsOfService;

    public FullTimeEmployee(String firstName, String lastName, String personalId,
                            double baseSalary, int yearsOfService) {
        super(firstName, lastName, personalId, baseSalary);
        this.yearsOfService = yearsOfService;
    }

    // Implementation of the abstract method
    @Override
    public double calculateSalary() {
        // Base salary + 3% for each year of service
        return getBaseSalary() * (1 + 0.03 * yearsOfService);
    }

    // Implementation of the method calculating vacation days
    @Override
    public int calculateVacationDays() {
        // Basic 20 days vacation + additional days for years of service
        return 20 + Math.min(yearsOfService, 10);  // max 10 additional days
    }
}