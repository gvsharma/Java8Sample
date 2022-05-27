import java.util.List;

public class Employee {
    String name;
    int salary;
    List<String> skills;

    public Employee(String name, int sal, List<String> skills){
        this.name = name;
        this.salary = sal;
        this.skills = skills;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
