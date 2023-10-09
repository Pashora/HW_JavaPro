import java.util.List;

public class Organization {
    private String name;
    private List<Department> departments;

    public Organization(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}