public class Department {
    private String name;
    private Director director;

    public Department(String name, Director director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public Director getDirector() {
        return director;
    }
}