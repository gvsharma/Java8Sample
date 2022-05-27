import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainApplication {
    public static void main(String[] args) {
        List<String>skills = new ArrayList<>();
        skills.add("JAVA");
        skills.add("Go");
        skills.add("Python");

        Employee employee = new Employee("test1", 19000, skills);

        List<String>skills1 = new ArrayList<>();
        skills.add("JAVA");
        skills.add("C#");
        skills.add("Python");
        Employee employee1 = new Employee("test2", 15000, skills1);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);

//        List<Employee> less = list.stream().filter(i->i.salary<10000).collect(Collectors.toList());
//        list.stream().filter(i->i.getSalary()<10000).map(i->
//        {
//            i.setSalary(10000);
//            return i;
//        }).forEach(i->System.out.println(i.name));

        Comparator<Employee> comparator = Comparator.comparing(Employee::getSalary);
//        list.stream().sorted(comparator).forEach(i->System.out.println(i.name));

        Comparator<Employee> comparator1 = Comparator.comparing(Employee::getName);
//        list.stream().filter(i->i.getSkills().stream().filter(j->j.equalsIgnoreCase("JAVA"))).forEach(i->System.out.println(i.name));
    }
}
