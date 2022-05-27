
public class Employee {
    String name;
    int salary;

    public Employee(String name, int sal){
        this.name = name;
        this.salary = sal;
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
}
