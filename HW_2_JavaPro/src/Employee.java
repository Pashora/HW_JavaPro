public class Employee {
    private String name;
    private int age;
    private String position;
    private Department department;

    public Employee(String name, int age, String position, Department department) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }
}
