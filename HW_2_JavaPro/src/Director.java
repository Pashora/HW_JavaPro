
public class Director extends Employee {
    private Organization organization;

    public Director(String name, int age, String position, Department department, Organization organization) {
        super(name, age, position, department);
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }
}
