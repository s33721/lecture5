public class FullTimeEmployee extends Employee {
    private int yearsOfService;

    public FullTimeEmployee(String firstName, String lastName, String personalId,
                            double baseSalary, int yearsOfService) {
        super(firstName, lastName, personalId, baseSalary);
        this.yearsOfService = yearsOfService;
    }
}