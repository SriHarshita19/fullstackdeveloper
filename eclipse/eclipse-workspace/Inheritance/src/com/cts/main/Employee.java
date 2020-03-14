import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class StreamApi {
	public static void main(String[] args) {
		List<Employee> employees =new ArrayList<Employee>();
		addEmployees(employees);
		//employees.forEach(System.out::println);
		//List<Employee> ageScale=employees.stream().filter(emp->emp.getAge()<22 && emp.getAddress().equals("Chennai")).collect(Collectors.toList());;
		//System.out.println("data with age <22\n");
		//ageScale.forEach(System.out::println);
		List<Employee> nameScale=employees.stream().filter(emp->emp.getName().length()>5).collect(Collectors.toList());
		System.out.println("data with namelength > 5\n");
	    nameScale.forEach(System.out::println);
	}
	private static void addEmployees(List<Employee> employees) {
		Employee emp1 = new Employee(101, "Abinhhh", "Hydrabad", 22, 6678687687L, 6786868.00);
		Employee emp2 = new Employee(102, "Anu", "Chennai", 21, 345354354L, 45464646.00);
		employees.add(emp1);
		employees.add(emp2);
	}
}