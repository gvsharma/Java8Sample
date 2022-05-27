import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApplication {
    public static void main(String[] args) {
        Employee employee = new Employee("test1", 9000);
        Employee employee1 = new Employee("test2", 15000);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);

        List<Employee> less = list.stream().filter(i->i.salary<10000).collect(Collectors.toList());
        list.stream().filter(i->i.getSalary()<10000).map(i->
        {
            i.setSalary(10000);
            return i;
        }).forEach(i->System.out.println(i.name));
    }
}
